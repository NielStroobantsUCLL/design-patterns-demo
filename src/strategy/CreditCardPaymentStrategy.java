package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid with Credit Card.");
    }
}
