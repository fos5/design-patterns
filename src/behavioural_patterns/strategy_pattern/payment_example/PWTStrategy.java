package behavioural_patterns.strategy_pattern.payment_example;

public class PWTStrategy implements PaymentStrategy {
    @Override
    public void validatePaymentRequest(String paymentRequest) {
        System.out.println("Validating PWT payment request: " + paymentRequest);
    }

    @Override
    public void processPaymentRequest(String paymentRequest) {
        System.out.println("Processing PWT payment request: " + paymentRequest);
    }
}
