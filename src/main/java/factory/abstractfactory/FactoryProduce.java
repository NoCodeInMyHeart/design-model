package factory.abstractfactory;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class FactoryProduce {
    public static AbstractFactory produceFactory(String factoryType){
        if (factoryType == null) return null;
        AbstractFactory abstractFactory = null;
        if ("server".equals(factoryType)){
            abstractFactory = new ServerFactory();
        }else if ("send".equals(factoryType)){
            abstractFactory = new SendFactory();
        }
        return abstractFactory;
    }
}
