public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        while (k > 0) {
            int n = arr.length - 1;
            while (n > 0) {
                int temp = arr[n];
                arr[n] = arr[n - 1];
                arr[n - 1] = temp;
                n--;
            }
            k--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
