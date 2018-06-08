package factory.staticfactory;

import factory.EmailSend;
import factory.Send;
import factory.SmsSend;

/**
 * 简单工厂模式：静态工厂
 * 简单工厂模式有一个问题就是，类的创建依赖工厂类，
 * 也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则.
 * 比如新增一个发送XXX的功能，就需要修改此类。
 * 更好的方法：工厂方法设计模式
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class StaticFactory {

    /**
     * 返回上层接口
     * 面向接口
     * @return
     */
    public static Send emailSend(){
        return new EmailSend();
    }

    public static Send smsSend(){
        return new SmsSend();
    }
}
