package org.cgmlti.dominios.java.Ejercicio3;

public class Vehiculo {
    Integer codigo, capacidadCarga;
    boolean estado;

    //Constructor por defecto es aquel que no tiene parametros
    public Vehiculo() {
        System.out.println("Ingreso al constructor por defecto");
    }
    //Constructor con parametros
    public Vehiculo(Integer codigo, Integer capacidadCarga, boolean estado) {
        this.codigo = codigo;
        this.capacidadCarga = capacidadCarga;
        this.estado = estado;
    }

    
}


