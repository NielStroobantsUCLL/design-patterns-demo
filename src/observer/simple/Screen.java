package observer.simple;

public class Screen implements ButtonListener {
    @Override
    public void onClick() {
        System.out.println("Screen: Button click detected!");
    }
}
