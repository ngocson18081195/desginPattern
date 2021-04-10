import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 3/22/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 3/22/2021
 */
public class sortRow {

    public static String convert(String s, int numRows) {
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        int cur = 0;
        boolean goingDown = false;
        for (char c: s.toCharArray()) {
            rows.get(cur).append(c);
            if (cur == 0 || cur == numRows - 1) {
                goingDown = !goingDown;
            }
            cur += goingDown? 1 : -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (StringBuilder row : rows) {
            stringBuilder.append(row);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "AB";
        int row = 3;
        System.out.println(convert(s, row));
    }
}
