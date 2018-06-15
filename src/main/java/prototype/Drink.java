package prototype;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public interface Drink {
    /**
     * 喝接口
     * @return
     */
    void drink();
    /**
     * 克隆接口
     * @return
     */
    Drink clone();
}
