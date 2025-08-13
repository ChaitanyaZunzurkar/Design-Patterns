package Factory.Vehicals;

public class FactoryOfVehicels {
    private Vehicle pVehicel;

    public FactoryOfVehicels(int choice) {
        if(choice == 1) {
            pVehicel = new TwoWheeler();
        } else if(choice == 2) {
            pVehicel = new ThreeWheeler();
        } else if(choice == 3) {
            pVehicel = new FourWheeler();
        } else {
            pVehicel = null;
        }
    }

    public void objectCleanUp() {
        if(pVehicel != null) {
            pVehicel = null;
        }
    }

    public Vehicle getVehicel() {
        return this.pVehicel;
    }
}
