package AbstractFactory.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleType;

        vehicleType = new CarFactory();

        Vehicle vehicle = new Vehicle(vehicleType);
        vehicle.assembleVehicle();
    }
}
