package factory.abstractfactory;

import factory.Send;

/**
 * 抽象工厂模式
 * @author: ${user}
 * @date: ${date} ${time}
 */
public abstract class AbstractFactory {
    public abstract ServerSelect serverSelect(String server);
    public abstract Send send(String send);
}
