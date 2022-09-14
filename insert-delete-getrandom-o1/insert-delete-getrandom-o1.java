class RandomizedSet {
    ArrayList<Integer> list;
    Random rnd = new Random();
    
    public RandomizedSet() {
        list = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(list.contains(val)) {
            return false;    
        }
        
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(list.contains(val)) {
            int index = list.indexOf(val);
            list.remove(index);
            return true;
        }
        
        return false;
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */