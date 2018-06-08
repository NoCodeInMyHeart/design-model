package factory.abstractfactory;

import factory.EmailSend;
import factory.Send;
import factory.SmsSend;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class SendFactory extends AbstractFactory{
    public ServerSelect serverSelect(String server) {
        return null;
    }

    public Send send(String sendType) {
        if (sendType == null) return null;
        Send send = null;
        if ("email".equals(sendType)){
            send = new EmailSend();
        }else if ("sms".equals(sendType)){
            send = new SmsSend();
        }
        return send;
    }
}
