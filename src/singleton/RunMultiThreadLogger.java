package singleton;

public class RunMultiThreadLogger {
    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread A is writing a message.");
        });

        Thread threadB = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.log("Thread B is writing a message.");
        });

        threadA.start();
        threadB.start();
    }
}
