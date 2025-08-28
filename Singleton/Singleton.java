public class Singleton {
    public static void main(String[] args) {
        // test eager singleton
        // EagerSingleton.getInstance().doSomeThing();

        // test lazy singleton in single-threaded
        // LazySingleton.getInstance().doSomThing();

        // Creating two threads and calling the methods
        Thread thread1 = new Thread(() -> {
            LazySingleton.getInstance().doSomThing();
            System.out.println(LazySingleton.getInstance().hashCode()); 
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            LazySingleton.getInstance().doSomThing();
            System.out.println(LazySingleton.getInstance().hashCode()); 
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
