class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;

        String str = String.valueOf(x);
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        sb.reverse();

        return str.equals(sb.toString());
    }
}