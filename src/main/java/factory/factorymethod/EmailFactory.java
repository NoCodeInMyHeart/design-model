package factory.factorymethod;

import factory.EmailSend;
import factory.Send;
import factory.factorymethod.FactoryMethod;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class EmailFactory implements FactoryMethod {
    public Send producer() {
        return new EmailSend();
    }
}
