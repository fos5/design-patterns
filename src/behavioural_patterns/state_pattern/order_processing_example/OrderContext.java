package behavioural_patterns.state_pattern.order_processing_example;

import behavioural_patterns.state_pattern.order_processing_example.states.NewState;

public class OrderContext {
    private OrderState currentState;
    public OrderContext() {
        this.currentState = new NewState();
    }
    public void setCurrentState(OrderState currentState) {
        this.currentState = currentState;
    }
    public void processOrder() {
        currentState.processOrder(this);
    }
    public  void returnOrder() {
        currentState.returnOrder(this);
    }
    public void ship(){
        currentState.shipOrder(this);
    }
    public void deliver(){
        currentState.deliverOrder(this);
    }
    public void cancelOrder() {
        currentState.cancelOrder(this);
    }

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.processOrder();
        orderContext.ship();
        orderContext.deliver();
        orderContext.returnOrder();
        orderContext.cancelOrder();
    }
}
