package main.prototype;

public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger databaseLogger = loggerFactory.getLogger();
        databaseLogger.writelog();
    }
}
