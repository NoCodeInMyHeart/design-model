package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public abstract class Buger implements Item {

    public Pack pack() {
        return new Wrapper();
    }

    public abstract  Float price();
}
