package ObserverPattern.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 2/26/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 2/26/2021
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void AttachObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void DetachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void NotifyObservers(Subject subject, Object o) {
        this.observers.forEach(observer -> observer.Notify(subject, o));
    }
}

