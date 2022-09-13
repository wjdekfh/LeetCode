class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        
        for(int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }
        
        Set<Integer> set2 = new HashSet();
        for(int i=0; i<nums2.length; i++) {
            if(set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        
        int[] result = new int[set2.size()];
        Iterator<Integer> iter = set2.iterator();
        int idx = 0;
        while(iter.hasNext()) {
            result[idx++] = iter.next();
        }
        
        return result;
    }
}