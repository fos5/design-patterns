package creational_patterns.singleton_pattern.impl;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    // Private constructor to prevent instantiation
    private StaticBlockSingleton() {
        // Initialization code here
    }

    // Static block for initialization
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton3 = StaticBlockSingleton.getInstance();

        System.out.println("Singleton 1 hash code: " + singleton1.hashCode());
        System.out.println("Singleton 2 hash code: " + singleton2.hashCode());
        System.out.println("Singleton 3 hash code: " + singleton3.hashCode());

        if (singleton1 == singleton2 && singleton2 == singleton3) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }

    // Same as EagerInitializationSingleton only that it uses a static block for initialization, and handles exceptions
    // during instance creation. This approach is also thread-safe and ensures that the instance is created
}
