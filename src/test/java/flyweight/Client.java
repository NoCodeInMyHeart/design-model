package flyweight;

public class Client {
    public static void main(String[] args) {
        String name = "苹果";
        for (int i = 0; i < 10;i ++){
            Apple apple = FoodFactory.getTygs(name);
            apple.setColor("红色");
            apple.setTaste("很棒");
            apple.eat();
            System.out.println(FoodFactory.getSize());
        }
    }

}
