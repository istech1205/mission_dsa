package two_sum.brute_force;

public class TwoSum {
    // Given an array of integers nums and an integer target, return indices of the
    // two numbers such that they add up to
    // target.You may assume that each input would have exactly one solution, and
    // you may not use the same element twice.

    public static int[] getResult(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] nums = { 1, 8, 15, 2, 5 };
        int target = 6;
        System.out.println("nums-" + target);

        int[] result = getResult(nums, target);

        System.out.println("result- index 1 = " + result[0] + " , index 2 = " + result[1]);

    }
}

// Time Complexity O(n square) because 2 nested loops