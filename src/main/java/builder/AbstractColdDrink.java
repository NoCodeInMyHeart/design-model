package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
 @SuppressWarnings("ALL")
 abstract class AbstractColdDrink implements Item{
    public Pack pack() {
        return new Bottle();
    }

    /**
     * 价格
     * @return
     */
    public abstract Float price();
}
