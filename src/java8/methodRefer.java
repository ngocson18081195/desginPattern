package java8;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 3/31/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 3/31/2021
 */

interface Execution {
    public int execute(int a, int b);
}

class MathUtil {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

}

public class methodRefer {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int sum = doAction(a, b, MathUtil::sum);
        System.out.println(sum);
    }

    public static int doAction(int a, int b, Execution func) {
        return func.execute(a, b);
    }
}
