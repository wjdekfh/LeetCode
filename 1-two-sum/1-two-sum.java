class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> valueMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int value = nums[i];
            int searchValue = target - value;

            int idex = valueMap.getOrDefault(searchValue, -1);
            if(idex != -1) {
                result[0] = idex;
                result[1] = i;
                break;
            }else {
                valueMap.put(value, i);
            }
        }

        return result;
    }
}