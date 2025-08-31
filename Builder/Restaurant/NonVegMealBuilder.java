package Builder.Restaurant;

public class NonVegMealBuilder implements Restaurant {
    private Meal meal;

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void buildStarter() {
        meal.setStarter("Chicken Tikka");
    }

    @Override
    public void buildMainCourse() {
        meal.setMainCourse("Chicken Biryani");
    }

    @Override
    public void buildDessert() {
        meal.setDessert("Ice Cream");
    }

    @Override
    public void reset() {
        this.meal = new Meal(); 
    }
}
