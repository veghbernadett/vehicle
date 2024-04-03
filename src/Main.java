//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create vehicle
        Vehicle jarmu = new Vehicle("Ford", "T", 1927, 20.00);
        //System.out.println(jarmu);
        Vehicle jarmu1 = new Vehicle("DeLorean", "DMC-12", 1981, 26.00);
        //System.out.println(jarmu1);

        // create auto
        Auto auto = new Auto("Volvo", "OV4",1927,32.00,4 );
        //System.out.println(auto);

        // create truck
        Truck teherauto = new Truck("SCANIA", "R620", 2021,
                25.00,18265.00);
        //System.out.println(teherauto);

        // create motorcycle
        Motorcycle kerekpar = new Motorcycle("Yamaha", "YD-1", 1957,
                30.00, 140);
        //System.out.println(kerekpar);

        Rentingsystem rentingsystem = new Rentingsystem();
        rentingsystem.addVehicle(jarmu);
        rentingsystem.addVehicle(jarmu1);
        rentingsystem.printVehicles();

        if (rentingsystem.hasVehicle(jarmu)) {
            System.out.println("Vehicle exists in the rental system.");
            rentingsystem.rentVehicle(jarmu);
        }
        else {
            System.out.println("Vehicle is not in the rental system.");
        }

        rentingsystem.printVehicles();

        if (rentingsystem.hasVehicle(jarmu)) {
            System.out.println("Vehicle exists in the rental system.");
            rentingsystem.bringBack(jarmu);
        }
        else {
            System.out.println("Vehicle is not in the rental system.");
        }

        rentingsystem.printVehicles();

        rentingsystem.printRentedVehicles();

        rentingsystem.printAvailableVehicles();

    }
}