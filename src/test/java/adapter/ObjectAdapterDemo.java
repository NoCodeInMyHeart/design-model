package adapter;

/**
 对象适配器模式

 　　原理：通过组合来实现适配器功能。

 　　当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法（虽然它目前不是我们的菜），然后在适配器P中定义私有变量C（对象）（B接口指向变量名），再定义一个带参数的构造器用来为对象C赋值，再在A接口的方法实现中使用对象C调用其来源于B接口的方法。
 */

/**
 * 实例讲解:
 *
 * 　我手中有个ps2插头的设备，但是主机上只有usb插头的插口，怎么办呢？弄个转换器，将ps2插头转换成为USB插头就可以使用了。
 　　接口Ps2：描述ps2接口格式
 　　接口Usb：描述USB接口格式
 　　类Usber：是接口Usb的实现类，是具体的USB接口格式
 　　Adapter：用于将ps2接口格式转换成为USB接口格式
 */
public class ObjectAdapterDemo {
    
    public static void main(String[] args) {
        Usber usber = new Usber();
        Ps2 ps2 = new ObjectAdapter(usber);
        ps2.isPs2();
    }
}

