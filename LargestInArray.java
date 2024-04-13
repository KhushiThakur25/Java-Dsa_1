public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 1, 6, 89, 100, 93 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }

        }
        System.out.println("Maximum value is :" + max);
    }
}
