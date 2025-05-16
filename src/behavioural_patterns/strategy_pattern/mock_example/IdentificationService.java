package behavioural_patterns.strategy_pattern.mock_example;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class IdentificationService {
    private final List<String> clients = List.of("CreditCard","PWT","SVA");


    public String getClient() {
        int random = ThreadLocalRandom.current().nextInt(0,3);
        return clients.get(random);
    }

}
