class Vehicle { // Vehicle is a super class

    // Attributes of the Vehicle class that are also inherited by Bike.java and
    // Car.java
    protected String color;

    protected String make;
    protected String model;

    protected int topSpeed;
    protected int numberOfWheels;

    static protected int vehicleCount;

    // Parameterized constructor
    public Vehicle(String color, String make, String model, int topSpeed, int numberOfWheels) {
        System.out.println("Inside Vehicle.java");
        this.color = color;
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.numberOfWheels = numberOfWheels;
        vehicleCount++;
    }

    // Default Constructor
    public Vehicle() {
        this.color = "Red";
        this.make = "Ford";
        this.model = "F-150";
        this.topSpeed = 100;
        this.numberOfWheels = 4;
        vehicleCount++;

    }

    // This method is also inherited by Car.java and Bicycle.java since they both
    // extend
    // Vehicle.java
    public void printVehicle() {
        System.out.println("This is a " + make + " " + model);

    }

    public static void printNumberOfVehiclesManufactured() {
        System.out.println("We have manufactured " + vehicleCount + " many vehicles.");
    }

    // public void printColor() {
    // System.out.println("This vehicle has a color of " + this.color);
    // }

}