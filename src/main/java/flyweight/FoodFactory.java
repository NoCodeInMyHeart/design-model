package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author meng.yang
 */
public class FoodFactory {

    private static final Map<String,Apple> tygs = new HashMap<>();

    public static Apple getTygs(String name){
        Apple apple = tygs.get(name);
        if (apple == null){
            apple = new Apple(name);
            tygs.put(name,apple);
        }
        return apple;
    }

    public static int getSize(){
        return tygs.size();
    }
}
