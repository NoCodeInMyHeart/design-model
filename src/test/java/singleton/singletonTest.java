package singleton;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class singletonTest {
    public static void main(String[] args) {
        Student s1 = (Student) SingletonEnum.STUDENT.getStudent();
        Student s2 = (Student) SingletonEnum.STUDENT.getStudent();
        System.out.println(s1 == s2);//true

        Student s3 = new Student();
        Student s4 = new Student();
        System.out.println(s3 == s4);//false

    }
}
