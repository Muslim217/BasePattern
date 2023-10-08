package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton == singleton2);
    }
}
