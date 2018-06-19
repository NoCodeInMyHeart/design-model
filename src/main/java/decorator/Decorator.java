package decorator;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Decorator implements Shape{

    Shape shape;
    Decorator(Shape shape){
        this.shape = shape;
    }
    public void draw() {
        shape.draw();
        setColor();
    }
    
    public void setColor(){
        System.out.println("上色");
    }
}
