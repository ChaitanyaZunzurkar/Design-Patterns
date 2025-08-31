package Builder.Restaurant;

public class VegMealBuilder implements Restaurant {
    private Meal meal;

    public VegMealBuilder() {
        this.meal = new Meal();
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Panner Tikka");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Veg Biryani");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Gulab Jamun");
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void reset() {
        this.meal = new Meal(); 
    }
}
