class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs.length == 1) return strs[0];

        int smallLength = Arrays.stream(strs).mapToInt(a -> a.length()).min().orElse(0);

        for(int i=0; i<smallLength; i++) {

            boolean check = true;
            char compareStr = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(strs[j].charAt(i) != compareStr) {
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