package singleton;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Student {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void say(String s){
        System.out.println("i am" + name);
    }
}
