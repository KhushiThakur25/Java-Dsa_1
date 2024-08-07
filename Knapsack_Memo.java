import java.util.Arrays;

public class Knapsack_Memo {
    static int Knapsack(int[] weights,int[] values,int capacity,int n,int[][] memo){
        if(n == 0 || capacity == 0){
            return 0;
        }
        if(memo[n][capacity] != -1){
            return memo[n][capacity];
        }
        if(weights[n-1] > capacity){
            memo[n][capacity] = Knapsack(weights,values,capacity,n-1,memo);
        }
        else{
            int include = values[n-1] + Knapsack(weights,values,capacity - weights[n-1],n-1,memo);
            int exclude = Knapsack(weights , values,capacity,n-1,memo);
            memo[n][capacity] = Math.max(include,exclude);
        }
        return memo[n][capacity];
    }
    public static void main(String[] args) {
        int[] weights = {1,3,4,5};
        int[] values = {1,4,5,7};
        int capacity = 7;
        int n = values.length;

        int[][] memo = new int[n+1][capacity+1];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        System.out.println("Maximum value:" + Knapsack(weights,values,capacity,n,memo));
    }
}
