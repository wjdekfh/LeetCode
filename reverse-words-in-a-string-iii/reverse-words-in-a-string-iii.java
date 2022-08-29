class Solution {
    public String reverseWords(String s) {
        List<String> result = new ArrayList();
        
        String temp = "";
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                result.add(temp);
                temp = "";
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