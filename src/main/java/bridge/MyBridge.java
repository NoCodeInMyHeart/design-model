package bridge;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class MyBridge extends AbstractBridge {

    @Override
    public void method(){
        getSource().method();
    }
}
