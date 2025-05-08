package behavioural_patterns.strategy_pattern.payment_example;

public class TransactionService {
    private final PaymentService paymentService;

    public TransactionService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processTransaction(String paymentRequest, String paymentMethod) {
        // Set the appropriate payment strategy based on the payment method
        if (paymentMethod.equalsIgnoreCase("creditcard")) {
            paymentService.setPaymentStrategy(new CreditCardStrategy());
        } else if (paymentMethod.equalsIgnoreCase("pwt")) {
            paymentService.setPaymentStrategy(new PWTStrategy());
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        // Process the payment request
        paymentService.processPaymentRequest(paymentRequest);
    }

    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService(new PaymentService());
        transactionService.processTransaction("123 456 7890", "pwt");

        transactionService.processTransaction("123 456 7890", "creditcard");
    }
}
