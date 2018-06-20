package factory;

/**
 * 实现发送接口实现邮件发送
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class EmailSend implements Send{
    @Override
    public void send() {
        System.out.println("发送邮件");
    }
}
