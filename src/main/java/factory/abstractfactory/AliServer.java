package factory.abstractfactory;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class AliServer implements ServerSelect{
    @Override
    public void select() {
        System.out.println("选择阿里服务器");
    }
}
