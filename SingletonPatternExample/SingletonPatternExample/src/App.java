
public class App {
    public static void main(String[] args) throws Exception {
        Logger logger1 = Logger.getLoggerInstance();
        Logger logger2 = Logger.getLoggerInstance();

        System.out.println("logger1 ID: " + System.identityHashCode(logger1));
        System.out.println("logger2 ID: " + System.identityHashCode(logger2));

        System.out.println("Are they the same? " + (logger1 == logger2));
    }
}
