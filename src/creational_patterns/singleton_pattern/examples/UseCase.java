package creational_patterns.singleton_pattern.examples;

public class UseCase {
    private final AppConfig appConfig;

    public UseCase(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    public static void main(String[] args) {
        UseCase useCase = new UseCase(AppConfig.INSTANCE);
        UseCase useCase2 = new UseCase(AppConfig.INSTANCE);
        UseCase useCase3 = new UseCase(AppConfig.INSTANCE);



    }
}
