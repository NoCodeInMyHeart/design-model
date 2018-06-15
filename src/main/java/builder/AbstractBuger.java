package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
abstract class AbstractBuger implements Item {

    public Pack pack() {
        return new Wrapper();
    }

    /**
     * 价格
     * @return
     */
    public abstract  Float price();
}
