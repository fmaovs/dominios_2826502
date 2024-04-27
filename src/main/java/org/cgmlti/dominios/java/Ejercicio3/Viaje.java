package org.cgmlti.dominios.java.Ejercicio3;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
public class Viaje {
    LocalDate fechaInicio, fechaFin;

    //Crear un metodo que imprima la duracion del viaje
    public Period calcularDuracionViaje(LocalDate fechaInicio, LocalDate fechaFin){
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        Period diferencia = Period.between(fechaInicio, fechaFin);
        //System.out.println(diferencia.getDays());
        return diferencia;
    }

    //Sobrecarga calcularDuracionViaje
    public int calcularDuracionViaje(){
        Period diferenciaDias = Period.between(fechaInicio, fechaFin);
        return diferenciaDias.getDays();
    }


}
