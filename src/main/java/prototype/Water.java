package prototype;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Water implements Drink{
    @Override
    public void drink() {
        System.out.println("我喝白开水");
    }

    @Override
    public Drink clone() {
        return new Water();
    }
}
