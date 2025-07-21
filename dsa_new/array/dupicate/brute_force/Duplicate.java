package dupicate.brute_force;

public class Duplicate {

    public static boolean getResult(int[] nums) {

        boolean isDuplicate = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return isDuplicate;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };

        boolean isDuplicate = getResult(nums1);
        boolean isDuplicate2 = getResult(nums2);

        System.out.println("num 1 is " + isDuplicate);
        System.out.println("num 2 is " + isDuplicate2);

    }

    // time complexity is O(n square)
}
