class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> sum = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            sum.put(nums[i], sum.getOrDefault(nums[i], 0) + 1);
        }
        
        int[] result = new int[k];
        for(int i=0; i<k; i++) {
            result[i] = findTop(sum);
        }
        
        return result;
    }
    
    public int findTop(HashMap<Integer, Integer> sum)  {
        int topKey = -100000;
        int top = 0;
        for(int key : sum.keySet()) {
            if(top < sum.get(key)) {
                topKey = key;
                top = sum.get(key);
            }
        }
        
        sum.remove(topKey);
        
        return topKey;
    }
}