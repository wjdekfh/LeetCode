class MyQueue {
    private List<Integer> queue;
    public MyQueue() {
        queue = new ArrayList();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        int value = queue.remove(0);
        
        return value;
    }
    
    public int peek() {
        return queue.get(0);
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */