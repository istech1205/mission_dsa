package buy_sell.brute_force;

public class BuySell {

    public static int getResult(int[] nums) {

        int max_profit = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                int profit = nums[j] - nums[i];
                if (profit > max_profit) {
                    max_profit = profit;
                }
            }

        }

        return max_profit;

    }

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };

        int result = getResult(nums);

        System.out.println("profit is = " + result);
    }
}

//Time complexity - O(n sqaure) because nested loop