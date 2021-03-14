import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
public class sum {

    public static int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i <= nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                int sum = nums[i] + nums[j];
//                if (sum == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return null;
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (integerIntegerMap.get(result) != null) {
                return new int[] {integerIntegerMap.get(result), i};
            }
            integerIntegerMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
