package strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with PayPal.");
    }
}
