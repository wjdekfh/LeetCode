class Solution {
    public int lengthOfLastWord(String s) {
        int wordCnt = 0;
        for(int i=s.length()-1; i>=0; i--) {
            char word = s.charAt(i);
            
            if(word == ' ') {
                if(wordCnt > 0) {
                    break;
                }else {
                    continue;
                }
            }
            
            wordCnt++;
        }
        
        return wordCnt;
    }
}