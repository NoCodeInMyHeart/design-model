package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ChickenBurger extends AbstractBuger {
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public Float price() {
        return 50.5f;
    }
}
