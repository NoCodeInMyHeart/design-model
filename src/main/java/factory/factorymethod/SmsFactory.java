package factory.factorymethod;

import factory.Send;
import factory.SmsSend;
import factory.factorymethod.FactoryMethod;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class SmsFactory implements FactoryMethod {
    public Send producer() {
        return new SmsSend();
    }
}
