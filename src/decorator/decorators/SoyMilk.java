package decorator.decorators;

import decorator.Beverage;

public class SoyMilk extends CondimentDecorator {
    private final Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.30;
    }
}
