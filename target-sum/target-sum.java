class Solution {
    private int result = 0;
    
    public int findTargetSumWays(int[] nums, int target) {    
        dfs(0, nums, target, 0);
        
        return result;
    }
    
    
    public void dfs(int idx, int[] nums, int target, int sum) {
        if (idx == nums.length) {
            if (target == sum) result++;
            return;
        }
        
        int value = nums[idx];
        
        dfs(idx+1, nums, target, sum + value);
        dfs(idx+1, nums, target, sum - value);
    }
}