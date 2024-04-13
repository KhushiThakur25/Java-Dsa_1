public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 1, 6, 89, 100, 93 };
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println("Second Maximum value is :" + secMax);
    }
}
