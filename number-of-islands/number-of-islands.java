class Solution {
    public int numIslands(char[][] grid) {
        int island = 0;
        for(int i=0; i< grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                island += removeIsland(grid, i, j);
            }
        }
        
        return island;
    }
                                
    // 섬을 삭제한다...
    public int removeIsland(char[][] grid, int x, int y) {
        if(x == -1 || y == -1) return 0;
        if(x >= grid.length || y >= grid[x].length) return 0;
        
        if(grid[x][y] == '1') {
            grid[x][y] = 0;
            
            removeIsland(grid, x, y-1); // 상
            removeIsland(grid, x, y+1); // 하
            removeIsland(grid, x-1, y); // 좌
            removeIsland(grid, x+1, y); // 우

            return 1;
        }else {
            return 0;
        }
    }
}