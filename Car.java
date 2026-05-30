public class Car {
    // Attributes
    String brand;
    String model;
    int year;

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Method to start the car
    void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object
        Car car1 = new Car();

        // Assigning values
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2024;

        // Calling methods
        car1.displayDetails();
        car1.startCar();
    }
}