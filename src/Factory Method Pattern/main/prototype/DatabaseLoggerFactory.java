package main.prototype;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger getLogger() {
        return new DatabaseLogger();
    }
}
