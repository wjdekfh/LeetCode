class Solution {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList();
        boolean exist = false;
        for(int i=0; i<arr.length; i++) {
            int value = arr[i];
            if(list.contains(2*value) || (value%2 == 0 && list.contains(value/2))) {
                exist = true;
                break;
            }
            
            list.add(value);
        }
        
        return exist;
    }
}