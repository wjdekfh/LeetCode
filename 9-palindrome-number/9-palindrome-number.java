class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String str = String.valueOf(x);

        int startIdx = 0;
        for(int endIdx=str.length()-1; startIdx<=endIdx; endIdx--, startIdx++) {
            if(str.charAt(startIdx) != str.charAt(endIdx)) {
                return false;
            }
        }

        return true;
    }
}