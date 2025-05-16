package behavioural_patterns.strategy_pattern.mock_example.strategies;

import behavioural_patterns.strategy_pattern.mock_example.PaymentStrategy;

public class PWT implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Processing payment using PWT strategy.");
    }
}
