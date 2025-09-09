package Decorator.Coffee;

public class MilkCoffeeDecorator extends CoffeeDecorator {
    public MilkCoffeeDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " , Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5.0;
    }
}
