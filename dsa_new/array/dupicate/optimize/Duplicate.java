package dupicate.optimize;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

    public static boolean getResult(int[] nums) {
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (sets.contains(nums[i])) {
                return true;
            }
            sets.add(nums[i]);

        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };

        boolean isDuplicate = getResult(nums1);
        boolean isDuplicate2 = getResult(nums2);

        System.out.println("num 1 is " + isDuplicate);
        System.out.println("num 2 is " + isDuplicate2);

    }

    // time complexity is O(n)
}
