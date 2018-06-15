package singleton;

/**
 * 通过枚举的特性实现安全高性能的单例模式
 * @author: ${user}
 * @date: ${date} ${time}
 */
@SuppressWarnings("AlibabaEnumConstantsMustHaveComment")
public enum SingletonEnum {
    /**
     * 用于创建单例学生类
     */
    STUDENT;
    private Student student;
    private SingletonEnum(){
        student = new Student();
    }
    public Student getStudent(){
        return student;
    }
}
