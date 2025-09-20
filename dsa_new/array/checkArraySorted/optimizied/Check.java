package checkArraySorted.optimizied;

public class Check {

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        boolean isSorted = isSorted(arr);
        System.err.println("isSorted : " + isSorted);
    }
}
