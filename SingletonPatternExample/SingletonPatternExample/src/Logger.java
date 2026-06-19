
public class Logger {

    private static Logger instance;

    private Logger() {
        // Private Constructor
    }
    public static Logger getLoggerInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
