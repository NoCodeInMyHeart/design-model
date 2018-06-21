package chainOfResponsibility;

/**
 * @author meng.yang
 */
public class ErrorLogger extends AbstractLogger{
    ErrorLogger(int level){
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("ErrorLogger ::Logger: " + message);
    }
}
