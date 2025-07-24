package patterns.strategy.withStrategy;

public class UpiStrategy implements PaymentStrategy{
    public void pay(){
        System.out.println("online payment method");
    }
}
