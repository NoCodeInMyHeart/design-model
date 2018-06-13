package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public abstract class ColdDrink implements Item{
    public Pack pack() {
        return new Bottle();
    }

    public abstract Float price();
}
