package buy_sell.optimize;

public class BuySell {

    public static int getResult(int[] prices) {

        int max_profit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                max_profit = Math.max(max_profit, price - minPrice);
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

// Time complexity - O(n sqaure) because nested loop