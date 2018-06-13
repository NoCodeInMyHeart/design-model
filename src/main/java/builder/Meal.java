package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class Meal {
    List<Item> items = new ArrayList<Item>();

    public void buy(Item item){
        items.add(item);
    }

    public float calculate(){
        float cost = 0;
        for (Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.pack().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
