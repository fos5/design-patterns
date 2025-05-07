package behavioural_patterns.state_pattern.order_processing_example.states;

import behavioural_patterns.state_pattern.order_processing_example.OrderContext;
import behavioural_patterns.state_pattern.order_processing_example.OrderState;

public class ReturnedState implements OrderState {
    @Override
    public void processOrder(OrderContext context) {

    }

    @Override
    public void cancelOrder(OrderContext context) {

    }

    @Override
    public void shipOrder(OrderContext context) {

    }

    @Override
    public void deliverOrder(OrderContext context) {

    }

    @Override
    public void returnOrder(OrderContext context) {

    }
}
