package prototype;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Water implements Drink{
    public void drink() {
        System.out.println("我喝白开水");
    }

    public Drink clone() {
        return new Water();
    }
}
