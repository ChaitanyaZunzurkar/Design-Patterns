package Facade.Orders;

public class Shipment implements ShipInventory{
    @Override
    public void ship() {
        System.out.println("Product is shiped successfully.");
    }
}
