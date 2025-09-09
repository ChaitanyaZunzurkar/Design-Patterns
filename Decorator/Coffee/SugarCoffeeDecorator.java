package Decorator.Coffee;

public class SugarCoffeeDecorator extends CoffeeDecorator {
    public SugarCoffeeDecorator(MilkCoffeeDecorator decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
    
}
