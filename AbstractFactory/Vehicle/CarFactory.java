package AbstractFactory.Vehicle;

public class CarFactory implements VehicleFactory {
    public Tire createTire() {
        return new CarTire();
    }

    public Engine createEngine() {
        return new CarEngine();
    }
}
