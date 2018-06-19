package bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例：
 * @author: ${user}
 * @date: ${date} ${time}
 */
public abstract class AbstractBridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
