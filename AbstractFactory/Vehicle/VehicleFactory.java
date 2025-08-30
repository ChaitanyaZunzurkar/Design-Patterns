package AbstractFactory.Vehicle;

interface VehicleFactory {
    Tire createTire();
    Engine createEngine();
}
