package behavioural_patterns.strategy_pattern.mock_example;

public class PaymentService {
    private final PaymentStrategy paymentStrategy;
    private final IdentificationService identificationService;

    public PaymentService(PaymentStrategy paymentStrategy, IdentificationService identificationService) {
        this.paymentStrategy = paymentStrategy;
        this.identificationService = identificationService;
    }
    public void processPayment() {
        String client = identificationService.getClient();
        System.out.println("Client: " + client);
        paymentStrategy.pay();
    }
}
