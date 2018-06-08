package singleton;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Test1 {
    private static Student student = SingletonEnum.STUDENT.getStudent();
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            student.say(""+i);
        }
    }
}
