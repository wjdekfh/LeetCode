class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> list = new HashMap();
        
        for(int i=0; i<numbers.length; i++) {
            int search = target - numbers[i];
            
            if(list.containsKey(search)) {
                result[0] = list.get(search)+1;
                result[1] = i+1;
                break;
            }else {
                list.put(numbers[i], i);
            }
        }
        
        return result;
    }
}