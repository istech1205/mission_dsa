package two_sum.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  // Given an array of integers nums and an integer target, return indices of the
  // two numbers such that they add up to
  // target.You may assume that each input would have exactly one solution, and
  // you may not use the same element twice.

  public static int[] getResult(int[] nums, int target) {

    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int currentSum = nums[left] + nums[right];
      if (currentSum == target) {
        return new int[] { left, right };
      }
      if (currentSum < target) {
        left++;
      } else {
        right--;
      }
    }

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    int target = 7;
    System.out.println("nums-" + target);

    int[] result = getResult(nums, target);

    System.out.println("result- index 1 = " + result[0] + " , index 2 = " + result[1]);

  }
}

// Time Complexity O(n) because single loop
// space complexity because O(n)