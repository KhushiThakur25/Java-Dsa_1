public class RunningSumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 23, 4, 5, 6 };
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // }
        // System.out.println("Sum of all elements of an array:" + sum);

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i + 1] += arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
