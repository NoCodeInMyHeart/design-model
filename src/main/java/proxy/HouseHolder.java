package proxy;

/**
 * @author: ${user}
 * @date: ${date} ${time}
 */
public class HouseHolder implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租房");
    }
}
