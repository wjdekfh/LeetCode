class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                deque.addFirst(nums[i]);
            }else {
                deque.addLast(nums[i]);
            }
        }
        
        return deque.stream().mapToInt(a -> a).toArray();
    }
}