class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        
        HashMap<String, List<String>> rslt = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String key = String.valueOf(a);
            
            List<String> strList = rslt.getOrDefault(key, new ArrayList());
            strList.add(strs[i]);
            
            rslt.put(key, strList);
        }
        
        for(String key : rslt.keySet()) {
            result.add(rslt.get(key));
        }
        
        return result;
    }
}