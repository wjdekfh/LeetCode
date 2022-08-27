class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum = 0;
        int oneCnt = 0;
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];
            
            if(num == 1) {
                oneCnt++;
            }
            
            maximum = Math.max(maximum, oneCnt);
            
            if(num != 1) {
                oneCnt = 0;
            }
        }
        
        return maximum;
    }
}