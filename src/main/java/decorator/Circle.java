package decorator;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个圆");
    }
}
