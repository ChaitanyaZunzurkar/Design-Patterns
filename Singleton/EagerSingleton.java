public class EagerSingleton {
    // Private constructor 
    private EagerSingleton() {

    }

    private static EagerSingleton instance = new EagerSingleton(); // creating a object early. But this will consume memory as it create a object even if we dont need it.
    public static EagerSingleton getInstance() {
        return instance;
    }

    public void doSomeThing() {
        System.out.println("Something is done using Eager initialization.");
    }
}
