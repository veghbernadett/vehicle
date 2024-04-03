// Subclass or derived class
public class Motorcycle extends Vehicle{
    int motorSize;
    public Motorcycle(String manufacturer, String model, int year, double rentalFee, int motorSize) {
        super(manufacturer, model, year, rentalFee);
        this.motorSize = motorSize;
    }
    // Method to return a string representing the object
    public String toString() {
        return "Manufacturer: " + manufacturer + ", model: " + model + ", year: " + year +
                ", rental fee: HUF" + rentalFee + ", rented: " + rented +
                ", motor size: " + motorSize;
    }

}
