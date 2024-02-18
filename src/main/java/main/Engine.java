package main;

public class Engine {
    String name;
    int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String toString() {
        return (name + " " + power + "kW");
    }
}
