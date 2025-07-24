package patterns.strategy.withStrategy;

public class NoteStrategy implements PaymentStrategy{
    public void pay(){
        System.out.println("offline payment method");
    }
}
