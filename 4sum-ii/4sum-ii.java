class Solution {
    
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map1 = new HashMap();
        for(int i=0; i<nums1.length; i++) { 
            for(int j=0; j<nums1.length; j++) {
                int sum = nums1[i] + nums2[j];
                
                if(map1.containsKey(sum)) {
                    map1.put(sum, map1.get(sum) + 1);
                }else {
                    map1.put(sum, 1);
                }
            }
        }
        
        int result = 0;
        for(int i=0; i<nums3.length; i++) { 
            for(int j=0; j<nums4.length; j++) {
                int sum = (nums3[i] + nums4[j]) * -1;
                
                if(map1.containsKey(sum)) {
                    result += map1.get(sum);
                }
            }
        }
        
        return result;
    }
}