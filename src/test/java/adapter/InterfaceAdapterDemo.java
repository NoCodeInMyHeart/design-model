package adapter;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class InterfaceAdapterDemo {
    public static void main(String[] args) {
        Methods methods = new NeedMethod();
        methods.method1();
        methods.method4();
    }
}
