package AbstractFactory.Vehicle;

public class BikeFactory implements VehicleFactory {
    public Tire createTire() {
        return new BikeTire();
    }

    public Engine createEngine() {
        return new BikeEngine();
    }
}
