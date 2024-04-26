package org.cgmlti.dominios.java.PruebaEjercicio3;


public class Prueba3 {
    public static void main(String[] args) {
        Viaje viaje1 = new Viaje();
        viaje1.fechaInicio = java.time.LocalDateTime.of(2024,4,26, 10,0,0);
        viaje1.fechaFin = java.time.LocalDateTime.of(2024, 4, 30, 5, 0, 0);
        
        CamionRemolque camionr1 = new CamionRemolque();
        camionr1.codigo = 123;
        camionr1.estado = true;
        camionr1.descripcion = "asdasfasjfabs";
        camionr1.cpacidadCarga = 10;
        camionr1.capacidadCargaExtra = 5;

        Camion camion1 = new Camion();
        camion1.codigo = 11;
        camion1.estado = true;
        camion1.potencia = 10;
        camion1.cpacidadCarga = 3;
        camion1.elTalViajeQueHizoElCamion = viaje1;

        Kamioneta camioneta1 = new Kamioneta();

        System.out.println("El viaje que realizó el camion tiene fecha inicio: " + viaje1.fechaInicio + " y fecha fin: " + viaje1.fechaFin);

    }
}
