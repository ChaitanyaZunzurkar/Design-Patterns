package AbstractFactory.ApplicationUI;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void assemble() {
        button.render();
        checkBox.render();
    }
}
