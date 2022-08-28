class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) { // row
            List<Integer> currRow = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) { // column
                if(j == 0 || j == i){
                    currRow.add(1);
                }else{
                    Integer left = result.get(i-1).get(j-1);
                    Integer right = result.get(i-1).get(j);
                    currRow.add(left+right);
                }
            }
            result.add(currRow);
        }
        
        return result;
    }
}