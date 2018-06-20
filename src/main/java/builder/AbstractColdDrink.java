package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
 @SuppressWarnings("ALL")
 abstract class AbstractColdDrink implements Item{
    @Override
    public Pack pack() {
        return new Bottle();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract Float price();
}
