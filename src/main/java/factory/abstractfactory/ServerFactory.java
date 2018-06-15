package factory.abstractfactory;

import factory.Send;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class ServerFactory extends AbstractFactory {
    private static final String ALI_SERVER = "ali";
    private static final String BAIDU_SERVE = "baidu";
    @Override
    public ServerSelect serverSelect(String server) {
        if (server == null){ return null;}
        ServerSelect serverSelect = null;
        if (ALI_SERVER.equals(server)){
            serverSelect = new AliServer();
        }else if (BAIDU_SERVE.equals(server)){
            serverSelect = new BaiduServer();
        }
        return serverSelect;
    }

    @Override
    public Send send(String send) {
        return null;
    }
}
