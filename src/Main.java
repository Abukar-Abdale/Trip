import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {

                ArrayList<Vehicle> vehicles = new ArrayList<>();
                vehicles.add(new Car("BMW", "m5", 250, 2018, 4));
                vehicles.add(new Truck("Scania", "R450", 250, 2018, 4, 35));
                vehicles.add(new Motorcycle("Yamaha", "MT-07", 250, 2018, false));


                VehicleInformationPrinter.printVehicleInformation(vehicles);
        }
}
