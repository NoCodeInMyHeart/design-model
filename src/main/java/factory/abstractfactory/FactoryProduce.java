package factory.abstractfactory;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class FactoryProduce {
    private static final String SERVER_TYPE = "server";
    private static final String SEND_TYPE = "send";

    public static AbstractFactory produceFactory(String factoryType){
        if (factoryType == null){ return null;}
        AbstractFactory abstractFactory = null;
        if (SERVER_TYPE.equals(factoryType)){
            abstractFactory = new ServerFactory();
        }else if (SEND_TYPE.equals(factoryType)){
            abstractFactory = new SendFactory();
        }
        return abstractFactory;
    }
}
