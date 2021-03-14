import java.util.Arrays;

/**
 * Description:
 * The string util class.
 * change history:
 * date              person             comments
 * -------------------------------------------------------------------------------
 * 3/10/2021        Ngoc Son           create file
 *
 * @author: Ngoc Son
 * @date: 3/10/2021
 */
public class SortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] collect = new int[nums1.length + nums2.length];
        int index = 0;
        for (int i : nums1) {
            collect[index] = i;
            index++;
        }
        for (int i : nums2) {
            collect[index] = i;
            index++;
        }
        Arrays.sort(collect);
        double sum = 0;
        if (collect.length % 2 == 0) {
            int e = (collect.length / 2) - 1;
            sum = (collect[e] + collect[e + 1]) / 2d;
        } else {
            int e = collect.length / 2;
            sum = collect[e];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {2};
        int[] b = {};
        System.out.println(findMedianSortedArrays(a, b));
    }
}
