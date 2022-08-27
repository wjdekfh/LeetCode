class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            result += tenDivideCnt(nums[i])%2 == 0 ? 1:0;
        }
        
        return result;
    }
    
    public int tenDivideCnt(int num) {
        int divideCnt = 1;
        if(num/10 > 0) {
            divideCnt += tenDivideCnt(num/10);
        }
        
        return divideCnt;
    }
}