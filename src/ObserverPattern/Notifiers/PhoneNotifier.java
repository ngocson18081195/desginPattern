package ObserverPattern.Notifiers;

import ObserverPattern.Video;
import ObserverPattern.base.Observer;
import ObserverPattern.base.Subject;

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
public class PhoneNotifier extends Observer {

    public PhoneNotifier(Subject subject) {
        this.subject = subject;
        this.subject.AttachObserver(this);
    }

    @Override
    public void Notify(Subject subject, Object o) {
        if (subject instanceof Video) {
            System.out.println("Video Data Phone " + ((Video) subject).getTitle() + " " + ((Video) subject).getDescription()
                    + " " + ((Video) subject).getFileName());
        }
    }
}
