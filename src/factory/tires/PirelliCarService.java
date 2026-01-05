package factory.tires;

public class PirelliCarService extends CarService {
    @Override
    protected Tire createTire() {
        return new PirelliTire();
    }
}
