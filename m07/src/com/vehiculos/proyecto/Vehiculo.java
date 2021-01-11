/**11/01/2021
 * @author wiamh
 * m07- : Software para taller de vehiculos (motos + coches), siguientes objetivos:
 *       			h1.Solicitar datos de los vehiculos y diferenciar entre coche y moto mediantes las ruedas.
 *       			h2. Modificar codigo BIKE para diferenciar rueda delantera de la trasera.
 *       			h3.Crear multiples usuarios y vehiculos con opcion a cerrar el programa.
 */
package com.vehiculos.proyecto;

import java.util.ArrayList;
import java.util.List;


public class Vehiculo {

    protected String plate;
    protected String brand;
    protected String color;
    protected List<Wheel> wheels = new ArrayList<Wheel>();


    public Vehiculo() {
        super();
    }

    public void Vehicle(String plate, String brand, String color) {
        this.plate = plate;
        this.brand = brand;
        this.color = color;
    }

    public Vehiculo(String plate, String brand, String color) {
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
