package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
       Scanner sc = new Scanner(System.in);
       ArrayList<Vehicle> vehicles = new ArrayList<>();

       boolean exit = false;
       while(!exit) {
        System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot, 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
        if (sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    int vehicleChoice = Integer.parseInt(sc.nextLine());
                    System.out.println("Anna kulkuneuvon valmistaja:");
                    String manufacturer = sc.nextLine();
                    System.out.println("Anna kulkuneuvon malli:");
                    String model = sc.nextLine();
                    System.out.println("Anna kulkuneuvon huippunopeus");
                    int maxSpeed = Integer.parseInt(sc.nextLine());

                    switch (vehicleChoice) {
                        case 1:
                            vehicles.add(new Car(manufacturer, model, maxSpeed));
                            break;
                        case 2:
                            vehicles.add(new Plane(manufacturer, model, maxSpeed));
                            break;
                        case 3:
                            vehicles.add(new Ship(manufacturer, model, maxSpeed));
                            break;
                        default:
                            System.out.println("Syöte oli väärä");
                    }
                    break;
                case 2:
                    for (Vehicle vehicle : vehicles) {
                        vehicle.listVehicles();
                    }
                    break;
                case 3:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Car) {
                            ((Car)vehicle).drive();
                        }
                    }
                    break;
                case 4:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Plane) {
                            ((Plane)vehicle).fly();
                        }
                    }
                    break;
                case 5:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Ship) {
                            ((Ship)vehicle).sail();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
            }
        }
       }
       sc.close();
    }
}
