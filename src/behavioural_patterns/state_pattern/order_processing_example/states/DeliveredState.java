package behavioural_patterns.state_pattern.order_processing_example.states;

import behavioural_patterns.state_pattern.order_processing_example.OrderContext;
import behavioural_patterns.state_pattern.order_processing_example.OrderState;

public class DeliveredState implements OrderState {
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Cannot process a delivered order.");
    }

    @Override
    public void cancelOrder(OrderContext context) {
        System.out.println("Cannot cancel a delivered order.");
    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        context.setCurrentState(new ReturnedState());
        System.out.println("Order has been returned.");
    }
}
