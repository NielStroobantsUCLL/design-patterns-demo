package factory.tires;

public class PirelliTire implements Tire {
    @Override
    public String brand() { return "Pirelli"; }

    @Override
    public int gripScore() { return 9; }
}

