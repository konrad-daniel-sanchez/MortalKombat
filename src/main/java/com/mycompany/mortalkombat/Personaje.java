package com.mycompany.mortalkombat;

class Personaje {
    private String nombre;
    private int vida;
    private double debilidad;
    private int poder;
    private int ataque;

    public Personaje(String nombre, int vida, double debilidad, int poder, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.debilidad = debilidad;
        this.poder = poder;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public double getDebilidad() {
        return debilidad;
    }

    public int getPoder() {
        return poder;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setDebilidad(double debilidad) {
        this.debilidad = debilidad;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    
    
    public void cargarPoder(){
        this.poder += 2;
        if(this.poder >= 10)
            System.out.println(this.nombre + " está listo para lanzar un commbo");
    }
    
    public int darPuno(){
        System.out.println(this.nombre + " está dando un puño, con un ataque de " + this.ataque);
        this.cargarPoder();
        return this.ataque;
    }
    
    public int patear(){
        System.out.println(this.nombre + " está dando una patada, con un ataque de " + this.ataque);
        this.cargarPoder();
        return this.ataque;
    }
    
    public void recibirGolpe(int ataqueRecibido){
        int valorADisminuir = (int)(ataqueRecibido * this.debilidad);
        System.out.println(this.nombre + " restó " + valorADisminuir + " puntos de vida");
        this.vida -= valorADisminuir;
        
        if(this.vida <= 0)
            System.out.println(this.nombre + " dice: 'Me morí'");
    }
    
    public void mostrarEstado(){
        System.out.println(this.nombre + " tiene " + this.vida + " puntos de vida y tiene " + this.poder + " puntos de poder.");
    }
    
    public void agachar(){
        
    }
    
    public void lanzarObjeto(){
        
    }
    
}
