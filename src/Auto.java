// Subclass or derived class
public class Auto extends Vehicle{
    int door;
    public Auto(String manufacturer, String model, int year, double rentalFee, int door) {
        super(manufacturer, model, year, rentalFee); // Call superclass constructor
        this.door = door;
    }

    // Method to return a string representing the object
    public String toString() {
        return "Manufacturer: " + manufacturer + ", model: " + model + ", year: " + year +
                ", rental fee: HUF" + rentalFee + ", rented: " + rented + ", door: " + door;
    }
}
