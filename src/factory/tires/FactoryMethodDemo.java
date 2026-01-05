package factory.tires;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        CarService sportSetup = new PirelliCarService();
        sportSetup.fitTires();

        CarService comfortSetup = new MichelinCarService();
        comfortSetup.fitTires();
    }
}

