public class EagerSingleton {
    private EagerSingleton() {

    }

    private static EagerSingleton instance = new EagerSingleton();
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomeThing() {
        System.out.println("Something is done using Eager initialization.");
    }
}
