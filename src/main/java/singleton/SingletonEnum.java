package singleton;

/**
 * 通过枚举的特性实现安全高性能的单例模式
 * @author: ${user}
 * @date: ${date} ${time}
 */
public enum SingletonEnum {
    STUDENT;
    private Student student;
    private SingletonEnum(){
        student = new Student();
    }
    public Student getStudent(){
        return student;
    }
}
