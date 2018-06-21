package iterator;

/**
 * @author meng.yang
 */
public interface Collection {

    /**
     *
     * @return
     */
    Iterator iterator();

    /**
     * 获取集合元素
     * @param i
     * @return
     */
    Object get(int i);

    /**
     * 获取集合大小
     * @return
     */
    int size();
}
