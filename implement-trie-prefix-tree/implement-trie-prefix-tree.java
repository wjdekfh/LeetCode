class Trie {

    private Set<String> data;
    
    public Trie() {
        data = new HashSet();
    }
    
    public void insert(String word) {
        data.add(word);
    }
    
    public boolean search(String word) {
        return data.contains(word);
    }
    
    public boolean startsWith(String prefix) {
        Iterator<String> it = data.iterator();
        while(it.hasNext()) {
            String a = it.next();
            if(a.startsWith(prefix)) {
                return true;
            }
        }
        
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */