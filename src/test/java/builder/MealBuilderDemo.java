package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class MealBuilderDemo {
    
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.getMeal1();
        meal1.showItems();
        System.out.println("花费" +  meal1.calculate());

        Meal meal2 = mealBuilder.getMeal2();
        meal2.showItems();
        System.out.println("花费" +  meal2.calculate());

    }
}
