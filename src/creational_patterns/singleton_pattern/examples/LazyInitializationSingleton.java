package creational_patterns.singleton_pattern.examples;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;
    private LazyInitializationSingleton(){}
    public static LazyInitializationSingleton getInstance(){
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        LazyInitializationSingleton lazyInitializationSingleton1 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton2 = LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton3 = LazyInitializationSingleton.getInstance();

        System.out.println("Singleton 1 hash code: " + lazyInitializationSingleton1.hashCode());
        System.out.println("Singleton 2 hash code: " + lazyInitializationSingleton2.hashCode());
        System.out.println("Singleton 3 hash code: " + lazyInitializationSingleton3.hashCode());

        if (lazyInitializationSingleton1 == lazyInitializationSingleton2 && lazyInitializationSingleton2 ==
                lazyInitializationSingleton3) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }

    /*
    PROS and CONS:
    PROS:
    - Lazy initialization: The instance is created only when it is needed, which can save resources.
    - Thread-safe: The instance is created in a thread-safe manner, ensuring that only one instance is created.
    - Flexible: The instance can be created at runtime, allowing for more flexibility in the application.
    CONS:
    - This particular approach works well in single threaded structures, but in multi-threaded environments,
     it can lead to multiple instances being created if multiple threads access the getInstance() method simultaneously.
     */
}
