package main;

public class Vehicle {
    String type;
    String manufacturer;
    String model;
    int maxSpeed;

    public Vehicle(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void listVehicles() {
        System.out.println(type + ": " + manufacturer + " " + model);
        System.out.println("Moottori: " + getEngineSpecs());
        System.out.println("Huippunopeus: " + maxSpeed + "km/h");
        System.out.println("");
    }

    public String getEngineSpecs() {
        return ("");
    }
}
