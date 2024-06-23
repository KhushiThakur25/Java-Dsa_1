public class MinMax_Recursion {
    static int[] findMinMax(int arr[], int index) {
        if (index == arr.length) {
            int[] minMax = new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE };
            return minMax;
        }
        int minMax[] = findMinMax(arr, index + 1);
        if (minMax[0] < arr[index]) {
            minMax[0] = arr[index];
        }
        if (minMax[1] > arr[index]) {
            minMax[1] = arr[index];
        }
        return minMax;
    }

    public static void main(String[] args) {
        int arr[] = { 70, 10, 50, 40, 30, 60 };
        int MinMax[] = findMinMax(arr, 0);
        for (int i : MinMax) {
            System.out.print(i + " ");
        }
    }
}
