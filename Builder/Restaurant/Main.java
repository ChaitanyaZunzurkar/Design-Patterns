package Builder.Restaurant;

public class Main {
    public static void main(String[] args) {
        Director vegDirector = new Director(new VegMealBuilder());
        Meal vegMeal = vegDirector.contructMeal();
        System.out.println("Veg Restaurant Meal: " + vegMeal);

        Director nonVegDirector = new Director(new NonVegMealBuilder());
        Meal nonVegMeal = nonVegDirector.contructMeal();
        System.out.println("Non-Veg Restaurant Meal: " + nonVegMeal);
    }
}
