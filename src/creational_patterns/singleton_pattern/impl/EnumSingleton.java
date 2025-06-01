package creational_patterns.singleton_pattern.impl;

public enum EnumSingleton {
    INSTANCE;

    // Add any additional methods or fields here if needed

    public void someMethod() {
        // Example method
        System.out.println("Method in EnumSingleton");
    }

    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        EnumSingleton singleton3 = EnumSingleton.INSTANCE;

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
