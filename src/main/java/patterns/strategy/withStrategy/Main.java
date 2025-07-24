package patterns.strategy.withStrategy;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new PayPalStrategy());
        paymentService.payable();

    }
}
