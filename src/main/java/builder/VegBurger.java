package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class VegBurger extends AbstractBuger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
