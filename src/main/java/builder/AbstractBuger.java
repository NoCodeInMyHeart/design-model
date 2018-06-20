package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
abstract class AbstractBuger implements Item {

    @Override
    public Pack pack() {
        return new Wrapper();
    }

    /**
     * 价格
     * @return
     */
    @Override
    public abstract  Float price();
}
