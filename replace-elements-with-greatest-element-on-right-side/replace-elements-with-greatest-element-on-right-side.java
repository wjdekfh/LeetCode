class Solution {
    public int[] replaceElements(int[] arr) {
        int rightMaximun = 0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] >= rightMaximun) {
                rightMaximun = 0;
                for(int j=i+1; j<arr.length; j++) {
                    rightMaximun = Math.max(arr[j], rightMaximun);
                } 
            }
            
            arr[i] = rightMaximun;
        }
        
        arr[arr.length-1] = -1;
        
        return arr;
    }
}