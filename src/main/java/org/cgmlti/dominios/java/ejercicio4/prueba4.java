package org.cgmlti.dominios.java.ejercicio4;

public class prueba4 {

    public static void main(String[] args) {
        
        Pais pais1 = new Pais("Colombia");

        Ciudad ciudad1 = new Ciudad("Bogotá");
        Ciudad ciudad2 = new Ciudad("Medellín");
        Ciudad ciudad3 = new Ciudad("Cali");

        Ruta ruta1 = new Ruta(123);

        pais1.listaCiudad.add(ciudad1);
        pais1.listaCiudad.add(ciudad2);
        pais1.listaCiudad.add(ciudad3);

        ruta1.listaCiudades.add(ciudad1);
        ruta1.listaCiudades.add(ciudad2);
        ruta1.listaCiudades.add(ciudad3);

        for(Ciudad recorrerPais : ruta1.listaCiudades ){
            System.out.println("Ciudad: " + recorrerPais.nombre);
        }



    }
}
