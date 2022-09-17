class MapSum {

    private Map<String, Integer> maps;
    
    public MapSum() {
        maps = new HashMap();
    }
    
    public void insert(String key, int val) {
        maps.put(key, val);
    }
    
    public int sum(String prefix) {
        int sum = 0;
        for(String key : maps.keySet()) {
            if(key.startsWith(prefix)) {
                sum += maps.get(key);
            }
        }
        
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */