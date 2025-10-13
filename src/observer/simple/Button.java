package observer.simple;

public class Button {
    private ButtonListener listener;

    public void setListener(ButtonListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println("Button was clicked.");
        if (listener != null) {
            listener.onClick();
        }
    }
}
