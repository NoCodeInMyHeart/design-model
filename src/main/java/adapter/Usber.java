package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Usber implements Usb{

    @Override
    public void isUsb() {
        System.out.println("usb连接方式");
    }
}
