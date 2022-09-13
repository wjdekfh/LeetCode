class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] != '.'){
                    int boxNo = i/3*3 + j/3;
                    if(s.contains("R"+i+board[i][j]) ||
                       s.contains("C"+j+board[i][j]) ||
                       s.contains("B"+boxNo+board[i][j])){
                        return false;
                    } else {
                        s.add("R"+i+board[i][j]);
                        s.add("C"+j+board[i][j]);
                        s.add("B"+boxNo+board[i][j]);
                    }
                }
            }
        }
        
        return true;
    }
}