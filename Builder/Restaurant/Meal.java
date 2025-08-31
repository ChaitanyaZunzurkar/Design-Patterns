package Builder.Restaurant;

public class Meal {
    private String starter;
    private String mainCourse;
    private String dessert;

    public Meal setStarter(String starter) {
        this.starter = starter;
        return this;
    }

    public Meal setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public Meal setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    @Override
    public String toString() {
        return "Meal [Starter=" + starter + ", Main Course=" + mainCourse + ", Dessert=" + dessert + "]";
    }
}
