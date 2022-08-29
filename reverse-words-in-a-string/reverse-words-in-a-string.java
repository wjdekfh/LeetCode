class Solution {
    public String reverseWords(String s) {
        int len = s.length();

        List<String> result = new ArrayList();

        String temp = "";
        for(int i=len-1; i>=0; i--) {
            char c = s.charAt(i);

            if(c == ' ') {
                if(!temp.equals("")) {
                    result.add(temp);
                    temp = "";
                }
            }else {
                temp = c + temp;
            }
        }

        if(!temp.equals("")) {
            result.add(temp);
        }

        return String.join(" ", result);
    }
}