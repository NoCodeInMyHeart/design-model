package flyweight;

/**
 *@author meng.yang
 */
public class Apple implements Food{

    private String name;
    private String color;
    private String taste;

    Apple(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public void eat() {
        System.out.println(color + "的" + name + "吃起来" + taste);
    }
}
