public class SearchEle_Recursion {
    static boolean searchElement(int[] arr, int ele, int index) {
        if (index == arr.length) {
            return false;
        }
        if (arr[index] == ele) {
            return true;
        }
        return searchElement(arr, ele, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 70, 10, 50, 40, 30, 60 };
        int ele = 90;
        System.out.println(searchElement(arr, ele, 0));
    }
}
