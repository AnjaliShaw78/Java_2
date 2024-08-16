package superClass;
class Vehicle {
     String make;
     int year;

    // Constructor for Vehicle
    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    // Method to display details
    public String displayDetails() {
        return "Make: " + make + ", Year: " + year;
    }
}

// Define the Car class that inherits from Vehicle
class Car extends Vehicle {
    private String model;

    // Constructor for Car
    public Car(String make, int year, String model) {
        super(make, year); // Call the parent class constructor
        this.model = model; // Additional field for Car
    }

    // Override the displayDetails method
    @Override
    public String displayDetails() {
        // Call the parent class displayDetails method using super
        return super.displayDetails() + ", Model: " + model;
    }
}

// Example usage

public class AssignmentSuperClass {

	public static void main(String[] args) {
		 Car myCar = new Car("Mahindra", 2023, "Marazzo");
	        System.out.println(myCar.displayDetails()); // Output: Make: Toyota, Year: 2022, Model: Camry
	    
	}

}
