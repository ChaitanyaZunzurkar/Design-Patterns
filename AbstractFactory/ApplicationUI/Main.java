package AbstractFactory.ApplicationUI;

public class Main {
    public static void main(String[] args) {
        UIFactory factory;

        factory = new MacUIFactory();

        Application app = new Application(factory);
        app.assemble();
    }
}
