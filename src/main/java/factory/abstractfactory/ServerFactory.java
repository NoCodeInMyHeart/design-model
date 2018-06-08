package factory.abstractfactory;

import factory.Send;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ServerFactory extends AbstractFactory {
    public ServerSelect serverSelect(String server) {
        if (server == null) return null;
        ServerSelect serverSelect = null;
        if ("ali".equals(server)){
            serverSelect = new AliServer();
        }else if ("baidu".equals(server)){
            serverSelect = new BaiduServer();
        }
        return serverSelect;
    }

    public Send send(String send) {
        return null;
    }
}
