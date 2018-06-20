package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

 /** 
  * 
  * @author: meng.yang
  */
public class DynamicProxy implements InvocationHandler{

    private Object realMan;

    public DynamicProxy(Object realMan){
       this.realMan = realMan;
    }

    /**
     * 实现InvocationHandler接口的 invoke 方法，当代理类调用真实对象的方法时，将直接寻找执行 invoke 方法。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable
    {
        // 执行代理自己添加的行为操作
        this.preRent();
        // 以反射（reflection）的形式引用真实对象的方法
        method.invoke(realMan, args);
        // 执行代理自己添加的行为操作
        this.postRent();
        return null;
    }

    /**
     * 代理类自行添加的行为
     */
    public void preRent()
    {
        System.out.println("I need more money!");
    }

    /**
     * 代理类自行添加的行为
     */
    public void postRent()
    {
        System.out.println("I will deduct some money!");
    }
}
