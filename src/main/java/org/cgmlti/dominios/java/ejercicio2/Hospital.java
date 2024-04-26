package org.cgmlti.dominios.java.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    String nombre, direccion;
    Long telefono;
    

    //Lista de Medicos:
    //También es un atributode los objetos hospital
    List <Medico> listaMedicos = new ArrayList<Medico>();
    
    
    //Lista de Salas:
    //También es un atributode los objetos hospital
    List <SalaHospital> listaSala = new ArrayList<SalaHospital>();
}
