package patterns.strategy.withoutStrategy;

public class PayPalPayment extends Payment{
    void pay(){
        System.out.println("online Payment method");
    }
}
