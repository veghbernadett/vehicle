// Subclass or derived class
public class Truck extends Vehicle{
    double loadCapacity;
    public Truck(String manufacturer, String model, int year, double rentalFee, double loadCapacity) {
        super(manufacturer, model, year, rentalFee); // Call superclass constructor
        this.loadCapacity = loadCapacity;
    }

    // Method to return a string representing the object
    public String toString() {
        return "Manufacturer: " + manufacturer + ", model: " + model + ", year: " + year +
                ", rental fee: HUF" + rentalFee + ", rented: " + rented +
                ", load capacity: " + loadCapacity;
    }
}
