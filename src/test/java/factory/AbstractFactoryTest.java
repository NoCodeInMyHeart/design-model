package factory;

import factory.abstractfactory.AbstractFactory;
import factory.abstractfactory.FactoryProduce;
import factory.abstractfactory.ServerSelect;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFactory sendFactory = FactoryProduce.produceFactory("send");
        AbstractFactory serverFactory = FactoryProduce.produceFactory("server");


        ServerSelect emailServer = serverFactory.serverSelect("ali");
        Send emailSend = sendFactory.send("email");
        emailServer.select();
        emailSend.send();

        ServerSelect emailServer1 = serverFactory.serverSelect("baidu");
        Send emailSend1 = sendFactory.send("sms");
        emailServer1.select();
        emailSend1.send();
    }
}
