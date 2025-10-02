package strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Eerst betalen met creditcard
        cart.setPaymentStrategy(new CreditCardPaymentStrategy());
        cart.checkout(100);

        // Dan betalen met PayPal
        cart.setPaymentStrategy(new PayPalPaymentStrategy());
        cart.checkout(200);
    }
}
