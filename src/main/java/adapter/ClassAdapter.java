package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ClassAdapter extends Usber implements Ps2{

    @Override
    public void isPs2() {
        isUsb();
    }
}
