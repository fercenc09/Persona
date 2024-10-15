package com.mycompany.persona;

public class Principal {
    public static void main(String[] args) {
        Persona Nicka = new Persona("Santiago", "Pizzarraga Luquin", 15);
        System.out.println("Nombre: " + Nicka.getNombre() + "\nApellidos: " + Nicka.getApellidos() + "\nEdad: " + Nicka.getEdad());
        Nicka.camina();
        Nicka.duerme();
    }
}
