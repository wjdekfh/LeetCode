class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        if(s.length() < 2) return s.length();
        
        HashSet<String> basket = new HashSet<>();
        String[] S = s.split("");

        for(int i=0; i<S.length; i++) {
            basket.add(S[i]);
            int noMatch = 1;

            for(int j=i+1; j<S.length; j++) {
                if(basket.contains(S[j])) {
                    basket.clear();
                    break;
                }
                
                basket.add(S[j]);
                noMatch += 1;
            }

            result = Math.max(result , noMatch);
        }

        return result;
    }
}