package AbstractFactory.Vehicle;

public class Vehicle {
    private Tire tire;
    private Engine engine;

    public Vehicle(VehicleFactory vehicle) {
        this.tire = vehicle.createTire();
        this.engine = vehicle.createEngine();
    }

    public void assembleVehicle() {
        tire.manufactureTire();
        engine.manufactureEngine();
    }
}
