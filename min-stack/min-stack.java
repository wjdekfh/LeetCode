class MinStack {
    private List<Integer> stack;
    private int min = Integer.MAX_VALUE;
    
    public MinStack() {
        stack = new LinkedList();
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        stack.add(0, val);
    }
    
    public void pop() {
        int value = stack.remove(0);
        if(value == min) {
            min = Integer.MAX_VALUE;
            for(int i=0; i<stack.size(); i++) {
                min = Math.min(min, stack.get(i));
            }
        }
    }
    
    public int top() {
        return stack.get(0);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */