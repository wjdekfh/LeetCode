class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            result[i] = (int) Math.pow((long)Math.abs(nums[i]), 2);
        }
        
        Arrays.sort(result);
        return result;
    }
}