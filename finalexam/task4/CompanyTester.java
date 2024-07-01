package finalexam.task4;

public class CompanyTester {
    public static void main(String[] args) {
        TransportationCompany company = new TransportationCompany("123 Main St", "VAT123456");

        Vehicle vehicle1 = new Vehicle("Truck", "ABC123", 10000);
        Vehicle vehicle2 = new Vehicle("Van", "XYZ789", 2000);

        company.addVehicle(vehicle1);
        company.addVehicle(vehicle2);

        System.out.println("Vehicle List:");
        for (Vehicle v : company.getVehicles()) {
            System.out.println(v);
        }

        company.saveVehiclesToFile("vehicles.dat");

        company.removeVehicle(vehicle1);

        System.out.println("Vehicle List after removal:");
        for (Vehicle v : company.getVehicles()) {
            System.out.println(v);
        }

        company.loadVehiclesFromFile("vehicles.dat");

        System.out.println("Vehicle List after loading from file:");
        for (Vehicle v : company.getVehicles()) {
            System.out.println(v);
        }
    }
}

