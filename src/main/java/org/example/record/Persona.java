package org.example.record;

public record Persona(String nombre, String apellido, int edad) implements records.example.IPersona {

    public static String puesto;

    static {
        puesto = "Desarrollador";
    }

    public Persona {
        if(edad < 18){
            throw new RuntimeException("Edad de " + edad + " No es válido");
        }
    }

    Persona(String nombre, String apellido){
        this(nombre, apellido, 13);
    }


    @Override
    public void imprimirNombre() {
        System.out.println("La persona que se está registrando: " + this.nombre + " su edad: " + edad + " y puesto: " + puesto);
    }

}
