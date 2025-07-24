package patterns.strategy.withoutStrategy;

public class Main {
    public static void main(String[] args) {

        Payment payment = new PayPalPayment();
        payment.pay();
        }
    }
