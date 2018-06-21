package observer;

/**
 * @author meng.yang
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("Observer1 update");
    }
}
