package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {
    public static void main(String[] args) {
        //  Crear 2 instacias de cada entidad
        //  Instaciar 2 veces cada Entidad
        //  Crear dos objetos de cada entidad
        //1. Nombre de la clase a instanciar
        //2. Nombre del objeto identificador
        //3. operador de asignacion
        //4. palabra (referencia) new
        //5. otra vez el nombre de la clase
        //6. parentesis (Contructor)
        
        Hospital hospitalEngativa = new Hospital();
        Hospital hospitalSanJose = new Hospital();

        //  Acceder a los atributos del objeto
        //  Operador .
        //  1. identificador del objeto
        //  2. el punto
        //  3. el atributo a trabajar
        //  4. El operador de asignación
        //  5. El valor a asignar al tributo

        hospitalEngativa.nombre = "Hospital de Engativa";
        hospitalEngativa.direccion = "Tranversal 100a #80a-50";
        hospitalEngativa.telefono = 4431790L;
        
        hospitalSanJose.nombre = "Hospital Infantil Universitario de San Jose";
        hospitalSanJose.direccion = "Cra. 52 #67a-71";
        hospitalSanJose.telefono = 3178001408L;

        //Crear Medicos
        Medico medico1 = new Medico();
        medico1.nombre = "Dante Bebe";
        medico1.cedula = 123456789L;
        medico1.especialidad = "Oncologia";
        
        Medico medico2 = new Medico();
        medico2.nombre = "Negrita";
        medico2.cedula = 321987654L;
        medico2.especialidad = "Cardiologia";
        
        Medico medico3 = new Medico();
        medico3.nombre = "Niebla pepis";
        medico3.cedula = 963852741L;
        medico3.especialidad = "Neurologia";


        //Añadir medicos al hospital
        hospitalEngativa.listaMedicos.add(medico1);
        hospitalEngativa.listaMedicos.add(medico2);
        hospitalEngativa.listaMedicos.add(medico3);

        for(Medico medicoRecorrer : hospitalEngativa.listaMedicos){
            System.out.println("Medico: " + medicoRecorrer.nombre);
            System.out.println("Cedula: " + medicoRecorrer.cedula);
            System.out.println("Especialidad: " + medicoRecorrer.especialidad);
        }

        //Crear salas
        SalaHospital sala1 = new SalaHospital();
        sala1.numero = 101;
        sala1.cantidadCamas = 5;
        
        SalaHospital sala2 = new SalaHospital();
        sala2.numero = 102;
        sala2.cantidadCamas = 3;

        hospitalEngativa.listaSala.add(sala1);
        hospitalEngativa.listaSala.add(sala2);

        for(SalaHospital salaRecorrer : hospitalEngativa.listaSala){
            System.out.println("Sala :" + salaRecorrer.numero);
            System.out.println("Cantidad de camas: " + salaRecorrer.cantidadCamas);
        }

    }
}
