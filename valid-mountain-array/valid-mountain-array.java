class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
        boolean up = true;
        boolean isMountain = true;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] == arr[i+1]) {
                isMountain = false;
                break;
            }
            
            if(up) {
                if(arr[i] > arr[i+1]) {
                    if(i == 0) {
                        isMountain = false;
                        break;
                    }
                    up = false;
                }
            }else {
                if(arr[i] < arr[i+1]) {
                    isMountain = false;
                    break;
                }
            }
            
        }
        
        return !up && isMountain;
    }
}