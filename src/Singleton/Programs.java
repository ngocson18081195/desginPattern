package Singleton;

public class Programs {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> SingletonInstance.getInstance().sayHello());
        Thread thread1 = new Thread(() -> SingletonInstance.getInstance().sayHello());
        thread.start();
        thread1.start();
    }
}
