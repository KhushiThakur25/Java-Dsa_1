public class LeaderElementII {
    public static void main(String[] args) {
        int arr[] = { 16, 17, 1, 3, 2 };
        int leader = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i > 0; i--) {
            if (leader < arr[i]) {
                leader = arr[i];
                System.out.println(leader);
            }

        }
    }
}
