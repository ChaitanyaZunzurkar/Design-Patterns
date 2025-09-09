package Facade.Orders;

public class Payment implements PaymentInterface {
    @Override
    public void successfulPayment() {
        System.out.println("Payment successful.");
    }
}
