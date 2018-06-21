package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author meng.yang
 */
public abstract class AbstractSubject implements Subject{

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo =  observers.elements();
        while (enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
