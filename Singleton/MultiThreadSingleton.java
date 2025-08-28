public class MultiThreadSingleton {
    // private constructor
    private MultiThreadSingleton() {

    } 

    private static MultiThreadSingleton instance = null;
    public static MultiThreadSingleton getInstance() {
        if(instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if(instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}
