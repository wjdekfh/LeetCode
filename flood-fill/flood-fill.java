class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target = image[sr][sc];
        if(target != color) {
            convert(image, sr, sc, target, color);    
        }
    
        return image;
    }
    
    public void convert(int[][] image, int sr, int sc, int target, int color) {
        if(sr >= 0 && sc >= 0 && sr <= image.length-1 && sc <= image[sr].length-1) {
            if(image[sr][sc] == target) {
                image[sr][sc] = color;
                
                // 상
                convert(image, sr-1, sc, target, color);
                // 하
                convert(image, sr+1, sc, target, color);
                // 좌
                convert(image, sr, sc-1, target, color);
                // 우
                convert(image, sr, sc+1, target, color);
            }
        }
    }
    
}