package creational_patterns.singleton_pattern.impl;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();
    private EagerInitializationSingleton() {
        // Private constructor to prevent instantiation
    }
    public static EagerInitializationSingleton getInstance() {
        return instance;
    }
}
/*
PROS and CONS:
PROS:
- Thread-safe: The instance is created at the time of class loading, ensuring thread safety.
- Simple implementation: The code is straightforward and easy to understand.
- No synchronization overhead: Since the instance is created at class loading time, there's no need for synchronization.
- Eager initialization: The instance is created eagerly, which can be beneficial if the instance is needed immediately.
CONS:
- Resource consumption: The instance is created even if it is never used, which can lead to unnecessary resource consumption.
- Lack of lazy loading: The instance is created at class loading time,
 which may not be ideal if the instance is expensive to create and not always needed.

 USE-CASES:
 - When you need a singleton instance that is required at the start of the application.
 - When the singleton instance is lightweight and does not consume significant resources.
 */