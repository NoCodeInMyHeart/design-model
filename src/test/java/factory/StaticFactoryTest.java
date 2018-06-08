package factory;

import factory.staticfactory.StaticFactory;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        StaticFactory.emailSend().send();
        StaticFactory.smsSend().send();
    }
}
