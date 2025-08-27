public class Singleton {
    public static void main(String[] args) {
        EagerSingleton.getInstance().doSomeThing();
        LazySingleton.getInstance().doSomThing();
    }
}
