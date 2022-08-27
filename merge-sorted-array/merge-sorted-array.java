class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Idx = 0;
        int nums2Idx = 0;
        Queue<Integer> queue = new LinkedList();
        for(int i=0; i<nums1.length; i++) {
            int value = nums1[i];
            
            if(value == 0 && nums1Idx >= m) {
                value = 1000000001;
            }
            
            queue.add(value);
            nums1Idx++;
            
            if(nums2Idx < n) {
                if(queue.peek() > nums2[nums2Idx]) {
                    nums1[i] = nums2[nums2Idx++];
                    continue;
                }
            }

            nums1[i] = queue.poll();
        }
    }
}