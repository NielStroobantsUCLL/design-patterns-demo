package factory.tires;

public class MichelinCarService extends CarService {
    @Override
    protected Tire createTire() {
        return new MichelinTire();
    }
}

