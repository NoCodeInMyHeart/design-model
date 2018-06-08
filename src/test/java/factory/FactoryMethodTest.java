package factory;

import factory.factorymethod.EmailFactory;
import factory.factorymethod.FactoryMethod;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new EmailFactory();
        factoryMethod.producer().send();
    }
}
