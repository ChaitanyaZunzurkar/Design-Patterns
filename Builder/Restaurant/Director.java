package Builder.Restaurant;

public class Director {
    private Restaurant restaurant;

    public Director(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Meal contructMeal() {
        restaurant.reset();  
        restaurant.buildStarter();
        restaurant.buildMainCourse();
        restaurant.buildDessert();

        return restaurant.getMeal();
    }
}
