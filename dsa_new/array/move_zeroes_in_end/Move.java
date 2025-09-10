package move_zeroes_in_end;

public class Move {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 0, 3, 0, 4 };
        int j = 0; // to handle non zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        // Print the array after moving zeroes to the end
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
