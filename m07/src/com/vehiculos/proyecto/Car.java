/**11/01/2021
 * @author wiamh
 * m07- : Software para taller de vehiculos (motos + coches), siguientes objetivos:
 *       			h1.Solicitar datos de los vehiculos y diferenciar entre coche y moto mediantes las ruedas.
 *       			h2. Modificar codigo BIKE para diferenciar rueda delantera de la trasera.
 *       			h3.Crear multiples usuarios y vehiculos con opcion a cerrar el programa.
 */
package com.vehiculos.proyecto;

import java.util.List;

public class Car extends Vehiculo {

    public Car() {
        super();
    }

    public Car(String plate, String brand, String color) {
        super(plate, brand, color);
    }

    public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
        addTwoWheels(frontWheels);
        addTwoWheels(backWheels);
    }

    public void addTwoWheels(List<Wheel> wheels) throws Exception {
        if (wheels.size() != 2) {
            throw new Exception("there are no two wheels to add");
        }
        Wheel rightWheel = wheels.get(0);
        Wheel leftWheel = wheels.get(1);

        if (!rightWheel.equals(leftWheel)){
            throw new Exception("the wheels are diferents");
        }
        this.wheels.add(leftWheel);
        this.wheels.add(rightWheel);
    }
}
