package Factory.Vehicles;

public class Main {
    public static void main(String[] args) {
        FactoryOfVehicels vehicle = new FactoryOfVehicels(2);
        Vehicle pVehicel = vehicle.getVehicel();

        if (pVehicel != null) {
            pVehicel.printVehicle();
        }
        vehicle.objectCleanUp();

    }
}
