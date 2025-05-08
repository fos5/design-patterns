package behavioural_patterns.strategy_pattern.payment_example;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void validatePaymentRequest(String paymentRequest) {
        System.out.println("Validating credit card payment request: " + paymentRequest);
    }

    @Override
    public void processPaymentRequest(String paymentRequest) {
        System.out.println("Processing credit card payment request: " + paymentRequest);
    }
}
