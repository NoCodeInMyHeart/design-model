package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public interface Item {
    /**
     * 物品姓名
     * @return
     */
    String name();
    /**
     * 物品包装
     * @return
     */
    Pack pack();
    /**
     * 物品价格
     * @return
     */
    Float price();
}
