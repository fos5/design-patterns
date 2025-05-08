package behavioural_patterns.strategy_pattern.payment_example;

public class PaymentService {
    private PaymentStrategy paymentStrategy;


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPaymentRequest(String paymentRequest) {
        // Validate the payment request
        paymentStrategy.validatePaymentRequest(paymentRequest);

        // Process the payment request
        paymentStrategy.processPaymentRequest(paymentRequest);
    }
}
