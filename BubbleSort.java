public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 8, 1, 5, 12, 6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
