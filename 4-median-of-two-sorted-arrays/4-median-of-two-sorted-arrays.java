class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double a = 0;

        int[] total = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, total, 0, nums1.length);
        System.arraycopy(nums2, 0, total, nums1.length, nums2.length);

        Arrays.sort(total);

        int divide = total.length/2;
        if(total.length%2 == 0) {
            a = ((double)total[divide-1] + (double)total[divide]) / 2 ;
        }else {
            a= total[divide];
        }

        return a;
    }
}