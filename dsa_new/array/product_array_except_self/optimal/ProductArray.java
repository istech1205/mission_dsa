package dsa_new.array.product_array_except_self.optimal;

import java.util.Arrays;

// We used Prefix and suffix pattern to solve this problem. 
public class ProductArray {

    private static int[] getResult(int[] nums) {

        int[] output = new int[nums.length];
        // calculate prefix // right of current index
        output[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }
        // System.out.println("output - " + Arrays.toString(output));
        // calculate post fix // left of current index
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = output[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };

        int[] result = getResult(nums);
        System.out.println("result - " + Arrays.toString(result));
    }
}
