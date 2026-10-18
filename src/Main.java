
public class Main {
    public static void main(String[] args) {

        VehicleReport truck = new TruckReport();
        VehicleReport bike = new BikeReport();

        System.out.println("=== TRUCK REPORT ===");
        truck.generateReport();

        System.out.println("=== BIKE REPORT ===");
        bike.generateReport();
    }
}
