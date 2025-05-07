package behavioural_patterns.state_pattern.order_processing_example;

public interface OrderState {
    void processOrder(OrderContext context);

    void cancelOrder(OrderContext context);

    void shipOrder(OrderContext context);

    void deliverOrder(OrderContext context);

    void returnOrder(OrderContext context);
}
