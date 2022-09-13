class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap();
        for(int i=0; i<list1.length; i++) {
            map1.put(list1[i], i);
        }

        List<String> result = new ArrayList();
        int min = 9999;
        for(int i=0; i<list2.length; i++) {
            if(map1.containsKey(list2[i])) {
                // System.out.println(list2[i]);
                int size = map1.get(list2[i]) + i;
                // System.out.println(size);
                
                if(size < min) {
                    min = size;
                    result.clear();
                    result.add(list2[i]);
                }else if(size == min) {
                    result.add(list2[i]);
                }
            }
        }
        
        
        return result.toArray(String[]::new); 
    }
}