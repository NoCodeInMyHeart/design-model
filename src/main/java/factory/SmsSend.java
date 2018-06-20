package factory;

/**
 * 实现发送接口实现短信发送
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class SmsSend implements Send{
    @Override
    public void send() {
        System.out.println("发送短信");
    }
}
