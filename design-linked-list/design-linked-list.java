class MyLinkedList {
    private List<Integer> list;
    
    public MyLinkedList() {
        list = new LinkedList();
    }
    
    public int get(int index) {
        try {
            return list.get(index);
        }catch(Exception e) {
            return -1;
        }
    }
    
    public void addAtHead(int val) {
        this.addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        list.add(val);
    }
    
    public void addAtIndex(int index, int val) {
        try {
            list.add(index, val);   
        }catch (Exception e) {}

    }
    
    public void deleteAtIndex(int index) {
        try {
            list.remove(index);
        }catch(Exception e) {}
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */