class Solution {
    public String longestPalindrome(String s) {
        String result = "";

        for(int i=0; i<s.length(); i++) {
            int len = Math.max(palindromicLength(s, i,i), palindromicLength(s, i,i+1));

            if(result.length() < len) {
                result = s.substring(i-(len-1)/2, i+(len/2)+1);
            }
        }

        return result;
    }
    
    public int palindromicLength(String str, int start, int end) {
        while(start>=0 && end<str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }

        return (end-start) -1;
    }
}