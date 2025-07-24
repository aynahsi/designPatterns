package patterns.strategy.withStrategy;

public class PayPalStrategy implements PaymentStrategy{
    public void pay(){
        System.out.println("online payment method");
    }
}
