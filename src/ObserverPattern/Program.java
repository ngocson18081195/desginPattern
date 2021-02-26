package ObserverPattern;

import ObserverPattern.Notifiers.EmailNotifier;
import ObserverPattern.Notifiers.FaceBookNotifier;
import ObserverPattern.Notifiers.PhoneNotifier;
import ObserverPattern.Notifiers.YoutubeNotifier;

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
public class Program {
    public static void main(String[] args) {
        Video video = new Video();
        EmailNotifier emailNotifier = new EmailNotifier(video);
        PhoneNotifier phoneNotifier = new PhoneNotifier(video);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(video);
        video.setTitle("Observer Pattern");

        video.DetachObserver(youtubeNotifier);
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        video.setDescription("AVC");
        FaceBookNotifier faceBookNotifier = new FaceBookNotifier(video);
        System.out.println("#####################");
        video.setFileName("#######");

    }
}
