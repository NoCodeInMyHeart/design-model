package bridge;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class SourceSub1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the first sub!");
    }
}
