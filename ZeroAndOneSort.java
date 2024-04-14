public class ZeroAndOneSort {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1 };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count += 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// write java code for sort the zero,one and two in an array..
