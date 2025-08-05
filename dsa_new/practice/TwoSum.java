package practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] getResult(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            }
            map.put(diff, i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] nums = { 2, -2, 4, 5, 8 };
        int target = 0;

        int[] result = getResult(nums, target);
        System.out.println("result is ..." + Arrays.toString(result));
    }
}
