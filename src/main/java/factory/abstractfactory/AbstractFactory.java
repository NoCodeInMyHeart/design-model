package factory.abstractfactory;

import factory.Send;

/**
 * 抽象工厂模式
 * @author: ${user}
 * @date: ${date} ${time}
 */
public abstract class AbstractFactory {
    /**
     * 服务器选择
     * @param server
     * @return
     */
    public abstract ServerSelect serverSelect(String server);

    /**
     * 发送方式选择
     * @param send
     * @return
     */
    public abstract Send send(String send);
}
