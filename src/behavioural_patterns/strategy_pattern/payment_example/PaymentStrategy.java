package behavioural_patterns.strategy_pattern.payment_example;

public interface PaymentStrategy {
    void validatePaymentRequest(String paymentRequest);
    void processPaymentRequest(String paymentRequest);
}
