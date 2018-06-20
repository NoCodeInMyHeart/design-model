package factory.abstractfactory;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class BaiduServer implements ServerSelect{
    @Override
    public void select() {
        System.out.println("选择百度的服务器");
    }
}
