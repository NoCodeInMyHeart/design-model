package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Coke extends AbstractColdDrink{
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public Float price() {
        return 30.0f;
    }
}
