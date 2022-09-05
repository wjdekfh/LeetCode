class MyStack {
    private List<Integer> queue;
    public MyStack() {
        queue = new ArrayList();
    }
    
    public void push(int x) {
        queue.add(0, x);
    }
    
    public int pop() {
        return queue.remove(0);
    }
    
    public int top() {
        return queue.get(0);
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */