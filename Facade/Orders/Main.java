package Facade.Orders;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Payment payment = new Payment();
        Shipment shipment = new Shipment();

        OrderFacade order = new OrderFacade(inventory, payment, shipment);
        order.createOrder();
    }
}
