package consicutive_ones;

public class Consecute1 {

    public static int getResult(int[] arr) {
        int output = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                output++;
                if (max < output) {
                    max = output;
                }
            } else {
                output = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 0, 1 };

        int result = getResult(arr);
        System.out.println("result is .." + result);

    }
}
