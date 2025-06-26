//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        LegacyVehicleInfo legacy = new LegacyVehicleInfo();

        vehicles.add(new Vehicle("Toyota", new CarFactory()));
        vehicles.add(new Vehicle("Harley", new MotorcycleFactory()));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getDetails());
            vehicle.performAction(); // Stopped
            vehicle.performAction(); // Moving

            VehicleInfoAdapter adapter = new VehicleInfoAdapter(legacy, vehicle.getDetails());
            System.out.println(adapter.displayInfo());
            System.out.println();
        }
    }
}