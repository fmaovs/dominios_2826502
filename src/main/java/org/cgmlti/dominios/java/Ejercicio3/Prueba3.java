package org.cgmlti.dominios.java.Ejercicio3;

import java.time.LocalDateTime;

public class Prueba3 {
    public static void main(String[] args) {

        //Viajes:
        Viaje viaje1 = new Viaje();
        viaje1.fechaInicio = java.time.LocalDateTime.of(2024,4,26, 10,0,0);
        viaje1.fechaFin = java.time.LocalDateTime.of(2024, 4, 30, 5, 0, 0);
        
        Viaje viaje2 = new Viaje();
        viaje2.fechaInicio = LocalDateTime.of(2024, 4, 25, 10, 30, 0);
        viaje2.fechaFin = LocalDateTime.of(2024, 4, 29, 12, 0, 0);
        
        Viaje viaje3 = new Viaje();
        viaje3.fechaInicio = LocalDateTime.of(2024, 4, 25, 16, 0, 0);
        viaje3.fechaFin = LocalDateTime.of(2024, 4, 28, 17, 30, 0);



        // Camiones de Remolque:
        CamionRemolque camionr1 = new CamionRemolque();
        camionr1.codigo = 1;
        camionr1.estado = true;
        camionr1.descripcion = "asdasfasjfabs";
        camionr1.cpacidadCarga = 10;
        camionr1.capacidadCargaExtra = 5;
        camionr1.viajeRemolque = viaje2;

        
        // Camiones:
        Camion camion1 = new Camion();
        camion1.codigo = 11;
        camion1.estado = true;
        camion1.potencia = 10;
        camion1.cpacidadCarga = 8;
        camion1.elTalViajeQueHizoElCamion = viaje1;


        //Camionetas:
        Camioneta camioneta1 = new Camioneta();
        camioneta1.codigo = 21;
        camioneta1.estado = true;
        camioneta1.esDobleCabina = false;
        camioneta1.cpacidadCarga = 3;
        camioneta1.viajesPorSemana = 5; 
        camioneta1.viajeCamioneta = viaje3;

        //System.out.println("El viaje que realizó el camion tiene fecha inicio: " + viaje1.fechaInicio + " y fecha fin: " + viaje1.fechaFin);
        System.out.println("Viaje del remolque desde: " + camionr1.viajeRemolque.fechaInicio + " hasta: " + camionr1.viajeRemolque.fechaFin  );




    }
}
