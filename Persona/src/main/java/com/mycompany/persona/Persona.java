/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persona;
/**
 *
 * @author Alumno
 */
public class Persona {
    String nombre, apellidos;
    int edad;
    
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
    
    public static void main(String[] args) {
        Persona Nicka = new Persona("Santiago", "Lizarraga Luqin", 15);
        System.out.println("Nombre: " + Nicka.getNombre() + "\nApellidos: " + Nicka.getApellidos() + "\nEdad: " + Nicka.getEdad());
        Nicka.camina();
        Nicka.duerme();
    }
}