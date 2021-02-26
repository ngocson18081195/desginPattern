package JavaStringTokens;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 1/25/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 1/25/2021
 */
public class JavaStringTokens {
    public static void main(String[] args) {
        String a = " ";

        a = a.replaceAll("[^\\p{Alpha}]+", " ").trim();

//        String[] split1 = trim.split("[\\p{Space}]+");
//        for (String s : split1) {
//            System.out.println(s);
//        }
        String[] split = a.split("\\p{Space}+");
        int length = (a.isEmpty()) ? 0 : split.length;
        System.out.println(length);
        for (String s : split) {
//            System.out.println(s);
        }
    }
}
