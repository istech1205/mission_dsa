package secondLargest;

public class SeondLargest {

    static int getResult(int[] num) {
        int first = num[0];
        int second = num[1];

        for (int value : num) {
            if (value > first) {
                second = first;
                first = value;
            } else if (value > second && value != first) {
                second = value;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] num = { 1,6, 2, 3, 4, 5 };
        int secondLargest = getResult(num);
        System.out.println(secondLargest);
    }
}
