import java.util.ArrayList;

public class VehicleInformationPrinter {
    public static void printVehicleInformation(ArrayList<Vehicle> vehicles) {
        System.out.println("Distance to travel: 200 km");
        System.out.println("Fuel price: 22.50 kr/l");
        System.out.println();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getBrand() + " " + vehicle.getModel() + " (" + vehicle.getYear() + ")");

            System.out.println("Fuel consumption: " + vehicle.getFuelConsumption() + " l/100 km");
            if (vehicle instanceof Car) {
                System.out.println("Max speed: " + ((Car) vehicle).getSpeed() + " km/h");
                System.out.println("Door count: " + ((Car) vehicle).getDoors());
            } else if (vehicle instanceof Motorcycle) {
                System.out.println("Max speed: " + ((Motorcycle) vehicle).getSpeed() + " km/h");
                System.out.println("Has windshield: " + ((Motorcycle) vehicle).isWindShield());
            } else if (vehicle instanceof Truck) {
                System.out.println("Max speed: " + ((Truck) vehicle).getSpeed() + " km/h");
                System.out.println("Door count: " + ((Truck) vehicle).getDoors());
                System.out.println("Capacity: " + ((Truck) vehicle).getCapacity());
            }
            System.out.println("Travel distance: 200 km");
            System.out.println("Fuel needed: " + (200 * vehicle.getFuelConsumption() / 100) + " l");
            System.out.println("Price: " + (200 * vehicle.getFuelConsumption() / 100 * 22.50) + " kr");
            System.out.println();
        }
    }
}
