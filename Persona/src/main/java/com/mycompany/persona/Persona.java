package com.mycompany.persona;

public class Persona {
    
    private String nombre, apellidos;
    protected int edad;
    
    //Clase
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //Getters y Setters Nombre
    public String getNombre(){return this.nombre;}
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //Getters y Setters Apellidos
    public String getApellidos(){return this.apellidos;}
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    //Getters y Setters Edad
    public int getEdad(){return this.edad;}
    public void setEdad (int edad){
        this.edad = edad;
    }
    //MÉTODOS
    public void camina(){
        System.out.println( this.nombre + " esta caminando...");
    }
    public void duerme(){
        System.out.println( this.nombre + " esta durmiendo...");
    }
}