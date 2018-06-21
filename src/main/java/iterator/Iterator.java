package iterator;

/**
 * @author meng.yang
 */
public interface Iterator {

    /**
     * 前移
     * @return
     */
    Object previous();
    /**
     *后移
     * @return
     */
    Object next();
    /**
     *是否有下一个
     * @return
     */
    boolean hasNext();
    /**
     *获取第一个
     * @return
     */
    Object getFirst();
}
