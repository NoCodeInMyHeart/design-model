package prototype;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        Drink drinkA = new Cola();
        drinkA.drink();

        //B和C都想和A喝一样的东西

        //未使用原型模式
        Drink drinkB = null;
        if(drinkA instanceof Cola){
            drinkB = new Cola();
            drinkB.drink();
        }else if (drinkA instanceof Water){
            drinkB = new Water();
            drinkB.drink();
        }

        if (drinkB != null){
            drinkB.drink();
        }

        //使用原型模式
        Drink drinkC = drinkA.clone();
        drinkC.clone();

    }
}
