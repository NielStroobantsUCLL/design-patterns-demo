package singleton;


public class RunSingleThreadLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Still using the same logger instance!");

        System.out.println("Same instance? " + (logger1 == logger2));

        System.out.println("Application finished.");
    }
}
