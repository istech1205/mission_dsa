package largest_element_array;

public class Largest {

    public static int getResult(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        int result = getResult(arr);
        System.out.println("result : " + result);
    }
}
