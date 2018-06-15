package prototype;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Cola implements Drink{
    public void drink() {
        System.out.println("我喝可乐");
    }

    @Override
    public Drink clone() {
        return new Cola();
    }
}
