package creational_patterns.singleton_pattern.impl;

public class DoubleCheckLazyLoadingSingleton {
    private static DoubleCheckLazyLoadingSingleton instance;

    private DoubleCheckLazyLoadingSingleton() {}
    public static DoubleCheckLazyLoadingSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckLazyLoadingSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckLazyLoadingSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        DoubleCheckLazyLoadingSingleton singleton1 = DoubleCheckLazyLoadingSingleton.getInstance();
        DoubleCheckLazyLoadingSingleton singleton2 = DoubleCheckLazyLoadingSingleton.getInstance();
        DoubleCheckLazyLoadingSingleton singleton3 = DoubleCheckLazyLoadingSingleton.getInstance();

        System.out.println("Singleton 1 hash code: " + singleton1.hashCode());
        System.out.println("Singleton 2 hash code: " + singleton2.hashCode());
        System.out.println("Singleton 3 hash code: " + singleton3.hashCode());

        if (singleton1 == singleton2 && singleton2 == singleton3) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
