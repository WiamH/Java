/**11/01/2021
 * @author wiamh
 * m07- : Software para taller de vehiculos (motos + coches), siguientes objetivos:
 *       			h1.Solicitar datos de los vehiculos y diferenciar entre coche y moto mediantes las ruedas.
 *       			h2. Modificar codigo BIKE para diferenciar rueda delantera de la trasera.
 *       			h3.Crear multiples usuarios y vehiculos con opcion a cerrar el programa.
 */
package com.vehiculos;

import com.vehiculos.proyecto.VehiculoServicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        VehiculoServicio service= new VehiculoServicio();

        System.out.println("-*--*--MENU INICIO--*--*-");
        System.out.println("1.-Register Car");
        System.out.println("2.-Register Bike ");
        System.out.println(">>>>>>Insert an option: ");
        int opcion=lector.nextInt();

        if(opcion==1)
        {
            System.out.println("Selected: 1.-Register Car");
            service.addCarro();

        } else if(opcion==2) {

            System.out.println("Selected: 2.-Register Bike");
            service.addBike();
        }
        lector.close();
    }
}
