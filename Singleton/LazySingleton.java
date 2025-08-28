public class LazySingleton {
    // Private constructor 
    private LazySingleton() {

    }

    // creating a instance 
    private static LazySingleton instance = null;

    // The code is not thread safe.
    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton(); // creating a object whenever it is needed. But this logic can't prevent creation of object in two thread simoutaniously 
        }
        return instance;
    }

    public void doSomThing() {
        System.out.println("Something is done using lazy initialization.");
    }
}
