class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        // 피보나치 처럼 경우의 수 구해서 리턴
        for(int i=2; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[dp.length - 1];
    }
}