package patterns.strategy.withStrategy;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payable(){
        paymentStrategy.pay();
    }
}
