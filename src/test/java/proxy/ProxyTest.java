package proxy;

import java.lang.reflect.Proxy;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ProxyTest {
    public static void main(String[] args) {
        Rent rent = new HouseHolder();
        DynamicProxy dynamicProxy = new DynamicProxy(rent);
        Rent rentProxy = (Rent)Proxy.newProxyInstance(HouseHolder.class.getClassLoader(),HouseHolder.class.getInterfaces(),dynamicProxy);
        rentProxy.rent();
    }
}
