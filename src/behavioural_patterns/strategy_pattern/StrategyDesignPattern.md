# Strategy Design Pattern Documentation

The Strategy Design Pattern allows a class's behavior to be selected at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. This promotes the Open/Closed Principle by enabling new strategies to be added without modifying existing code.

## Key Components
1. **Strategy Interface**: Defines a common interface for all supported algorithms.
2. **Concrete Strategies**: Implement the specific behavior of the algorithms.
3. **Context**: Maintains a reference to a Strategy object and delegates the behavior to the current strategy.

## Example Implementation

### Strategy Interface
```java
public interface PaymentStrategy {
    void validatePaymentRequest(String paymentRequest);
    void processPaymentRequest(String paymentRequest);
}
```

### Concrete Strategies
#### CreditCardStrategy
```java
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
```

#### PWTStrategy
```java
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
```

### Context Class
#### PaymentService
```java
public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPaymentRequest(String paymentRequest) {
        paymentStrategy.validatePaymentRequest(paymentRequest);
        paymentStrategy.processPaymentRequest(paymentRequest);
    }
}
```

### Client Class
#### TransactionService
```java
public class TransactionService {
    private final PaymentService paymentService;

    public TransactionService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processTransaction(String paymentRequest, String paymentMethod) {
        if (paymentMethod.equalsIgnoreCase("creditcard")) {
            paymentService.setPaymentStrategy(new CreditCardStrategy());
        } else if (paymentMethod.equalsIgnoreCase("pwt")) {
            paymentService.setPaymentStrategy(new PWTStrategy());
        } else {
            System.out.println("Invalid payment method.");
            return;
        }

        paymentService.processPaymentRequest(paymentRequest);
    }

    public static void main(String[] args) {
        TransactionService transactionService = new TransactionService(new PaymentService());
        transactionService.processTransaction("123 456 7890", "pwt");
        transactionService.processTransaction("123 456 7890", "creditcard");
    }
}
```

## Advantages
- Simplifies code by separating algorithm implementation from the context.
- Makes it easy to add new strategies without modifying existing code.

## Disadvantages
- Increases the number of classes in the system.
- The client must be aware of the different strategies to select the appropriate one.

## Usage
Ideal for scenarios where multiple algorithms can be used interchangeably.