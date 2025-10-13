package observer.simple;

public class Demo {
    public static void main(String[] args) {
        Button button = new Button();
        Screen screen = new Screen();

        button.setListener(screen);

        button.click();
    }
}
