import java.util.Arrays;

public class Climbing_stairs {
    //memorization
    public static int findClimbingStairs(int n, int ways[]){
        if(n<0) return 0;
        if(n==0) return 1;
        if(ways[n]!=-1){
            return ways[n];
        }else{
            ways[n] = findClimbingStairs(n-1, ways) + findClimbingStairs(n-2, ways);
        }
        return ways[n];
    }

    //tabulation
    public static int findClimbingStairs2(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i=1;i<=n;i++){
            if(i==1) dp[i] = dp[i-1];
            else
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(findClimbingStairs(n, ways));
        System.out.println(findClimbingStairs2(n));
    }
}
