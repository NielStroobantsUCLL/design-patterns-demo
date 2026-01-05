package factory.tires;

public abstract class CarService {

    // Factory Method
    protected abstract Tire createTire();

    // Business logic die het product gebruikt
    public void fitTires() {
        Tire tire = createTire(); // polymorf: subklasse bepaalt welke band
        System.out.println("Fitting tires...");
        System.out.println("Mounted " + tire.brand() + " tires with grip score " + tire.gripScore());
    }
}

