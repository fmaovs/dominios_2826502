package org.cgmlti.dominios.java.Ejercicio3;

public class CamionRemolque extends Vehiculo{
    Integer capacidadCargaExtra;
    String descripcion;
    Viaje viajeRemolque;

    //Crear metodo que pemrita calcular el total de carga

    public int calcularTotalCarga(){
        int totalCarga = capacidadCarga + capacidadCargaExtra;
        return totalCarga;
    }
}
