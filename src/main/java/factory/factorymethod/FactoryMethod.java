package factory.factorymethod;

import factory.Send;

/**
 * 工厂方法模式
 * 创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，
 * 不需要修改之前的代码。
 * @author: ${user}
 * @date: ${date} ${time}
 */
public interface FactoryMethod {

    Send producer();
}
