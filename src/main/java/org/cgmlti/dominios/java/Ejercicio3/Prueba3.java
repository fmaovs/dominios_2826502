package org.cgmlti.dominios.java.Ejercicio3;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Prueba3 {
    public static void main(String[] args) {

        //Crear una instancia de la clase vehiculo
        Vehiculo vehiculo1 = new Vehiculo(2, 5, true);
        

        //Viajes:
        Viaje viaje1 = new Viaje();
        viaje1.fechaInicio = java.time.LocalDate.of(2024,4,26);
        viaje1.fechaFin = java.time.LocalDate.of(2024, 4, 30);
        
        Viaje viaje2 = new Viaje();
        viaje2.fechaInicio = LocalDate.of(2024, 4, 25);
        viaje2.fechaFin = LocalDate.of(2024, 4, 29);
        
        Viaje viaje3 = new Viaje();
        viaje3.fechaInicio = LocalDate.of(2024, 4, 25);
        viaje3.fechaFin = LocalDate.of(2024, 4, 28);



        // Camiones de Remolque:
        CamionRemolque camionr1 = new CamionRemolque();
        camionr1.codigo = 1;
        camionr1.estado = true;
        camionr1.descripcion = "asdasfasjfabs";
        camionr1.capacidadCarga = 10;
        camionr1.capacidadCargaExtra = 5;
        camionr1.viajeRemolque = viaje2;
        //System.out.println("El viaje del camion con remolque duró: " + camionr1.viajeRemolque.calcularDuracionViaje(camionr1.viajeRemolque.fechaInicio, camionr1.viajeRemolque.fechaFin).getDays() + " días.");
        System.out.println("La diferencia de dias del viaje fue: "+ camionr1.viajeRemolque.calcularDuracionViaje() + " días.");
        //opcion 1
        int totalCarga = camionr1.calcularTotalCarga();
        //System.out.println("El total de la carga del camion con remolque es: " + totalCarga + " Toneladas.");
        
        //opcion 2
        //System.out.println("El total de la carga del camion con remolque es: " + camionr1.calcularTotalCarga() + " Toneladas.");

        
        // Camiones:
        Camion camion1 = new Camion();
        camion1.codigo = 11;
        camion1.estado = true;
        camion1.potencia = 10;
        camion1.capacidadCarga = 8;
        camion1.elTalViajeQueHizoElCamion = viaje1;


        //Camionetas:
        Camioneta camioneta1 = new Camioneta();
        camioneta1.codigo = 21;
        camioneta1.estado = true;
        camioneta1.esDobleCabina = false;
        camioneta1.capacidadCarga = 3;
        camioneta1.viajesPorSemana = 5; 
        camioneta1.viajeCamioneta = viaje3;

        //System.out.println("El viaje que realizó el camion tiene fecha inicio: " + viaje1.fechaInicio + " y fecha fin: " + viaje1.fechaFin);
        //System.out.println("Viaje del remolque desde: " + camionr1.viajeRemolque.fechaInicio + " hasta: " + camionr1.viajeRemolque.fechaFin  );
        //System.out.println("Viaje del remolque desde: " + camionr1.viajeRemolque.fechaInicio.getHour() + " hasta: " + camionr1.viajeRemolque.fechaFin.getHour()  );




    }
}
