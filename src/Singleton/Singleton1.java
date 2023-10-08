package Singleton;

public class Singleton1 {

    private static Singleton1 Instance;
    private static String name;
    private static int age;

    private Singleton1(){

    }

    public static void setName(String name) {
        Singleton1.name = name;
    }

    public static void setAge(int age) {
        Singleton1.age = age;
    }

    public static Singleton1 getInstance() {
        return Instance;
    }

    public static String getName() {
        return name;
    }

    public static int getAge() {
        return age;
    }
}
