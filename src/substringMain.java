import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 3/9/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 3/9/2021
 */
public class substringMain {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> characters = new HashSet<>();
        int length = s.length();
        int i = 0, j = 0, ans = 0;
        while (i < length && j < length) {
            if (!characters.contains(s.charAt(j))) {
                characters.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                characters.remove(s.charAt(i++));
            }
        }
        return ans;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (!characters.contains(c)) {
//                characters.add(c);
//            } else {
//                characters.remove(c);
//            }
//        }
//        return characters.size();
    }


    public static void main(String[] args) {
        String s = "abcffacasdiuysd";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
