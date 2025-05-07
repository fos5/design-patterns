package behavioural_patterns.state_pattern.order_processing_example.states;

import behavioural_patterns.state_pattern.order_processing_example.OrderContext;
import behavioural_patterns.state_pattern.order_processing_example.OrderState;

public class NewState implements OrderState {
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is now processing.");
        context.setCurrentState(new ProcessState());
    }

    @Override
    public void cancelOrder(OrderContext context) {
        System.out.println("Order has been cancelled.");
        context.setCurrentState(new CancelledState());
    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Cannot ship an order that hasn't been processed.");
    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Cannot deliver an order that hasn't shipped.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("Cannot return an order that hasn't been delivered.");
    }
}
