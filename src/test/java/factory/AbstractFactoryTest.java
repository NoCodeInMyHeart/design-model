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

        ServerSelect smsServer = serverFactory.serverSelect("baidu");
        Send smsSend = sendFactory.send("sms");
        smsServer.select();
        smsSend.send();
    }
}
