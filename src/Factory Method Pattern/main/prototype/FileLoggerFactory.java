package main.prototype;

public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger getLogger() {
        return new FileLogger();
    }
}
