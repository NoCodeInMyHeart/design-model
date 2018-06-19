package decorator;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circleShape = new Decorator(new Circle());
        circleShape.draw();

        Shape rectangleShape = new Decorator(new Rectangle());
        rectangleShape.draw();
    }
}
