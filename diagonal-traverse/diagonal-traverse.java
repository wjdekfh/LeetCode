class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        
        int x = 0;
        int y = 0;
        boolean up = true;
        for(int i=0; i<result.length; i++) {
            result[i] = mat[x][y];
            
            if(up) {
                if(x-1 >= 0 && y+1 < n) {
                    x--;
                    y++;
                }else if(x-1 >= 0 && y+1 > n) {
                    up = false;
                    x++;
                }else if(x-1 <= 0 && y+1 < n) {
                    up = false;
                    y++;
                }else {
                    x++;
                    up = false;
                }
            }else {
                if(x+1 < m && y-1 >= 0) {
                    x++;
                    y--;
                }else if(x+1 >= m && y-1 >= 0) {
                    up = true;
                    y++;
                }else if(x+1 < m && y-1 < 0) {
                    up = true;
                    x++;
                }else {
                    y++;
                    up = true;
                }
            }
        }
        
        return result;
    }
}