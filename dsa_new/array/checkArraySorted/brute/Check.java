package checkArraySorted.brute;

public class Check {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        boolean isSorted = isSorted(arr);
        System.err.println("isSorted : "+isSorted);
    }
}
