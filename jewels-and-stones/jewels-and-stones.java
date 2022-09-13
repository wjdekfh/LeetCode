class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;
        for(int i=0; i<stones.length(); i++) {
            char s = stones.charAt(i);
            
            if(jewels.contains(String.valueOf(s))) {
                cnt++;
            }
        }
        
        return cnt;
    }
}