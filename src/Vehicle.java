public class Vehicle {
    // Attributes of Vehicle class
    String manufacturer;
    String model;
    int year;
    double rentalFee;
    boolean rented;

    // Constructor with params
    public Vehicle(String manufacturer, String model, int year, double rentalFee){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.rentalFee =rentalFee;
        this.rented = false;
    }

    // Method to return a string representing the object
    public String toString() {
        return "Manufacturer: " + manufacturer + ", model: " + model + ", year: " + year +
                ", rental fee: HUF" + rentalFee + ", rented: "+ rented;
    }


    // Method vehicle is rented
    public void setRented(){
        rented = true;
    }

    // Method returned back
    public void setReturn(){
        rented = false;
    }


}
