package decorator;

import decorator.decorators.Mocha;
import decorator.decorators.SoyMilk;
import decorator.decorators.Whip;

public class Demo {
    public  static void main(String[] args) {

        var soyMilkMochaEspresso = new Mocha(new SoyMilk(new Espresso()));
        System.out.println(soyMilkMochaEspresso.getDescription() + " $" + soyMilkMochaEspresso.cost());

        var withAddedWhip = new Whip(soyMilkMochaEspresso);
        System.out.println(withAddedWhip.getDescription() + " $" + withAddedWhip.cost());
    }
}
