package Facade.Orders;

public class Inventory implements InvertoryInterface {
    @Override
    public void storeProduct() {
        System.out.println("Product is stored in the inventory.");
    }

    @Override
    public void relaseProduct() {
        System.out.println("Product is relased from the inventory.");
    }
}
