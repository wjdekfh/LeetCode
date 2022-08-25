class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 1) return strs[0];

        for(int i=0; i<strs[0].length(); i++) {

            boolean check = true;
            char compareStr = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != compareStr) {
                    check = false;
                    break;
                }
            }

            if(!check) {
                break;
            }

            result += compareStr;
        }

        return result;
    }
}