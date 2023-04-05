# TripCost
Vehicle Information Printer

Description:
This Java program uses an object-oriented approach to represent different types of vehicles (cars, trucks, and motorcycles) and their respective information such as brand, model, max speed, fuel consumption, doors (for cars and trucks), capacity (for trucks), and windshield (for motorcycles). The program utilizes an ArrayList to store instances of these vehicles.

The main class, "Main", creates instances of vehicles (a BMW M5 car, a Scania R450 truck, and a Yamaha MT-07 motorcycle) and adds them to the ArrayList. Then, the program calls a separate class called "VehicleInformationPrinter" to print the information of each vehicle, including the distance to travel (200 km) and the fuel cost based on the fuel price (19.42 kr/l) and the fuel consumption of each vehicle. The information is printed with appropriate formatting and displayed on the console.

This program demonstrates the use of object-oriented programming concepts such as inheritance (with the "Vehicle" superclass and the "Car", "Truck", and "Motorcycle" subclasses), polymorphism (with the use of the "Vehicle" type for the ArrayList), and method overriding (with the "getFuelNeeded()" method in each vehicle subclass). It also showcases how to organize code into separate classes for better maintainability and reusability. The program can be further extended to include additional vehicle types or functionalities as needed. Overall, it provides a simple yet effective way to calculate and display vehicle information for a given distance of 200 km. 
