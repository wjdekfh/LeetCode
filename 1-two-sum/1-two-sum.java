class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> valueMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int value = nums[i];
            int searchValue = target - value;

            if(valueMap.get(searchValue) != null) {
                result[0] = Math.min(i, valueMap.get(searchValue));
                result[1] = Math.max(i, valueMap.get(searchValue));
                break;
            }else {
                valueMap.put(value, i);
            }
        }

        return result;
    }
}