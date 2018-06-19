package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ObjectAdapter implements Ps2{

    Usber usber;

    public ObjectAdapter(Usber usber){
        this.usber = usber;
    }

    public void isPs2() {
        usber.isUsb();
    }
}
