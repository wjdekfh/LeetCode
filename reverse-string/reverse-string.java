class Solution {
    public void reverseString(char[] s) {
        int length = s.length-1;
        
        for(int i=0; i<length; i++, length--) {
            char temp = s[i];
            s[i] = s[length];
            s[length]= temp;
        }
    }
}