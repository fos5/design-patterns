package creational_patterns.singleton_pattern.impl;

public class BillPughSingleton {
    private BillPughSingleton(){}
    private static class SingletonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }

    public static void main(String[] args) {
        BillPughSingleton singleton1 = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();
        BillPughSingleton singleton3 = BillPughSingleton.getInstance();

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
