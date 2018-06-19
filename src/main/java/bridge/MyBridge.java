package bridge;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class MyBridge extends Bridge{

    @Override
    public void method(){
        getSource().method();
    }
}
