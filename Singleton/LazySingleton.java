public class LazySingleton {
    private LazySingleton() {

    }

    private static LazySingleton instance = null;
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void doSomThing() {
        System.out.println("Something is done using lazy initialization.");
    }
}
