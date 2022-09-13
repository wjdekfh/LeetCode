class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        Map<Integer, Integer> sumMap = new HashMap();
        
        for(int i=0; i<nums.length; i++) {
            int value = nums[i];
            
            if(sumMap.containsKey(target-value)) {
                r[0] = sumMap.get(target - value);
                r[1] = i;
                break;
            }else {
                sumMap.put(nums[i], i);
            }
        }
        
        return r;
    }
}