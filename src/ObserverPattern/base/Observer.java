package ObserverPattern.base;

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
public abstract class Observer {

    protected Subject subject;
    public abstract void Notify(Subject subject, Object o);
}
