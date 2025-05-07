package behavioural_patterns.state_pattern.order_processing_example.states;

import behavioural_patterns.state_pattern.order_processing_example.OrderContext;
import behavioural_patterns.state_pattern.order_processing_example.OrderState;

public class CancelledState implements OrderState {
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Cannot process a cancelled order.");
    }

    @Override
    public void cancelOrder(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Cannot ship a cancelled order.");
    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Cannot deliver a cancelled order.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Cannot return a cancelled order.");
    }
}
