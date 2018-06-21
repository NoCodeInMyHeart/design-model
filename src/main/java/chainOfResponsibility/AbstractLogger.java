package chainOfResponsibility;

import builder.Pack;

import java.io.StringReader;

/**
 * @author meng.yang
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger != null){
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 写入
     * @param message
     */
    abstract void write(String message);
}
