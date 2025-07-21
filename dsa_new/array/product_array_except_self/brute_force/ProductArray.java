package product_array_except_self.brute_force;

import java.util.Arrays;

// TIME complexity is 0(n square )  
public class ProductArray {

    private static int[] getResult(int[] nums) {

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = 0; j < output.length; j++) {
                if (j != i) {
                    product = product * nums[j];
                }
            }
            output[i] = product;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] result = getResult(nums);
        System.out.println("result - " + Arrays.toString(result));
    }
}
