package behavioural_patterns.state_pattern.order_processing_example.states;

import behavioural_patterns.state_pattern.order_processing_example.OrderContext;
import behavioural_patterns.state_pattern.order_processing_example.OrderState;

public class ProcessState implements OrderState {
    @Override
    public void processOrder(OrderContext context) {
        System.out.println("Order is already being processed.");
    }

    @Override
    public void cancelOrder(OrderContext context) {

    }

    @Override
    public void shipOrder(OrderContext context) {
        System.out.println("Order has been shipped.");
        context.setCurrentState(new ShippingState());
    }

    @Override
    public void deliverOrder(OrderContext context) {
        System.out.println("Cannot deliver an order that hasn't shipped.");
    }

    @Override
    public void returnOrder(OrderContext context) {
        System.out.println("lol");
    }
}
