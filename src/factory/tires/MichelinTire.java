package factory.tires;

public class MichelinTire implements Tire {
    @Override
    public String brand() { return "Michelin"; }

    @Override
    public int gripScore() { return 8; }
}

