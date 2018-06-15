package factory.abstractfactory;

import factory.EmailSend;
import factory.Send;
import factory.SmsSend;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class SendFactory extends AbstractFactory{
    private static final String EMAIL_SEND = "email";
    private static final String SMS_SEND = "sms";

    @Override
    public ServerSelect serverSelect(String server) {
        return null;
    }

    @Override
    public Send send(String sendType) {
        if (sendType == null){ return null;}
        Send send = null;
        if (EMAIL_SEND.equals(sendType)){
            send = new EmailSend();
        }else if (SMS_SEND.equals(sendType)){
            send = new SmsSend();
        }
        return send;
    }
}
