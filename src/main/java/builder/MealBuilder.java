package builder;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class MealBuilder {
    public Meal getMeal1(){
        Meal meal = new Meal();
        meal.buy(new VegBurger());
        meal.buy(new Coke());
        return meal;
    }

    public Meal getMeal2(){
        Meal meal = new Meal();
        meal.buy(new ChickenBurger());
        meal.buy(new Pepsi());
        return meal;
    }
}
