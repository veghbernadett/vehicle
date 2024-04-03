import java.util.ArrayList;
import java.util.List;

public class Rentingsystem {
    List<Vehicle> vehicles;

    public Rentingsystem() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public boolean hasVehicle(Vehicle vehicle) {
        return vehicles.contains(vehicle);
    }

    public void rentVehicle(Vehicle vehicle){
        if (vehicle.rented){
            System.out.println("Sorry, vehicle is rented");
        }
        else {
            vehicle.setRented();
            System.out.println(vehicle.manufacturer + " " + vehicle.model + ", vehicle is rented");
        }
    }

    public void bringBack(Vehicle vehicle){
        if (vehicle.rented){
            vehicle.setReturn();
            System.out.println(vehicle.manufacturer + " " + vehicle.model + ", vehicle is returned back");
        }
        else {
            System.out.println("System error, vehicle is not found.");;
        }
    }

    public void printVehicles(){
        System.out.println("List of vehicles: ");
        for (Vehicle item : vehicles) {
            System.out.println(item);
        }
    }

    public void printRentedVehicles(){
        System.out.println("Rented vehicles:");
        for (Vehicle item : vehicles) {
                if (item.rented) {
                  System.out.println(item);}
            }
        }

    public void printAvailableVehicles(){
        System.out.println("Available vehicles:");
        for (Vehicle item : vehicles) {
            if (!item.rented) {
                System.out.println(item);}
        }
    }

}
