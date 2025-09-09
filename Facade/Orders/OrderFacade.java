package Facade.Orders;

public class OrderFacade {
    private InvertoryInterface inventory;
    private PaymentInterface payment;
    private ShipInventory shipment;

    public OrderFacade(InvertoryInterface inventory, PaymentInterface payment, ShipInventory shipment) {
        this.inventory = inventory;
        this.payment = payment;
        this.shipment = shipment;
    }

    public void createOrder() {
        System.out.println("Starting order process...");
        inventory.relaseProduct();
        payment.successfulPayment();
        shipment.ship();
        System.out.println("Order process completed.");
    }
}
