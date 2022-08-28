class Solution {
    public int pivotIndex(int[] nums) {
        int result = -1;
        
        int totalSum = 0;
        for(int i=0; i<nums.length; i++) {
            totalSum += nums[i];
        }
        
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            if(i != 0) leftSum += nums[i-1];
            
            int check = totalSum-leftSum-nums[i];
            if(leftSum == check) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}