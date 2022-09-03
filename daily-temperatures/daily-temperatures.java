class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> tempIdx = new Stack();
        
        int[] result = new int[temperatures.length];
    
        for(int i=0; i<temperatures.length; i++) {
            while(!tempIdx.isEmpty() && temperatures[tempIdx.peek()] < temperatures[i]) {
                result[tempIdx.peek()] = i - tempIdx.pop();
            }
            
            tempIdx.push(i);
        }
        
        return result;
    }
}