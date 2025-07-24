package patterns.strategy.withoutStrategy;

public class UpiPayment extends Payment{
    void pay(){
        System.out.println("online Payment method");
    }
}
