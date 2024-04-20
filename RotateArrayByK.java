public class RotateArrayByK {
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        // to reverse the whole array by one
        reverse(arr, 0, arr.length - 1);
        // to reverse the first part of an array
        reverse(arr, 0, k - 1);
        // to reverse the second part of an array
        reverse(arr, k, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
