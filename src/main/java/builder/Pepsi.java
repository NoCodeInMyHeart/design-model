package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Pepsi extends AbstractColdDrink{
    @Override
    public String name() {
        return "百世可乐";
    }

    @Override
    public Float price() {
        return 25.0f;
    }
}
