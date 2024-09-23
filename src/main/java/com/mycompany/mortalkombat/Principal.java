package com.mycompany.mortalkombat;

import java.util.Scanner;

public class Principal {
    static Personaje subZero;
    static Personaje scorpio;

    static void subZeroAtaca(){
        int ataque = subZero.darPuno();
        scorpio.recibirGolpe(ataque);
        subZero.mostrarEstado();
        scorpio.mostrarEstado();
    } 
    
    static void scorpioAtaca(){
        int ataque = scorpio.patear();
        subZero.recibirGolpe(ataque);
        subZero.mostrarEstado();
        scorpio.mostrarEstado();
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        subZero = new Personaje("subZero", 100, 0.5, 0, 30);
        scorpio = new Personaje("scorpio", 120, 0.7, 0, 20);
        char tecla = ' ';
        System.out.println("BIENVENIDO AL JUEGO DE MORTAL KOMBAT");
        
        do{
            System.out.println("Seleecciona una opción");
            System.out.println("a. Ataca subZero");
            System.out.println("l. Ataca scorpio");
            System.out.println("z. Salir");

            tecla = lector.next().charAt(0);
            tecla = Character.toLowerCase(tecla);
            
            switch (tecla) {
                case 'a':
                    subZeroAtaca();
                    break;
                case 'l':
                    scorpioAtaca();
                    break;
                case 'z':
                    System.out.println("saliendo del juego");
                    break;
                default:
                    System.out.println("Tecla inválida");
            }
            if(subZero.getVida() <= 0 || scorpio.getVida() <= 0){
                /** Operador tarnario: **/
                String nombreGanador = (subZero.getVida() <= 0) ? scorpio.getNombre() : subZero.getNombre();
                System.out.println("El juego terminó, y el ganador es " + nombreGanador);
                tecla = 'z';
            }
        }while(tecla != 'z');
        
    }
}
