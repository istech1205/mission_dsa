package move_zeroes_in_end;

public class Move {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 0, 3, 0, 4 };

        int j = 0; // Pointer for the position of the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap elements at i and j
                int nonZero = nums[i];
                nums[i] = nums[j]; // This will be 0 if i != j
                nums[j] = nonZero; //
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
