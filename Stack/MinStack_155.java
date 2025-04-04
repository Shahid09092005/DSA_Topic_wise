class MinStack {
    int min=Integer.MAX_VALUE;
    Stack<Integer> st=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int val) {
        if(val<=min){
            minStack.push(val);
            min=val;
        }
        st.push(val);
    }
    
    public void pop() {
        int x= st.pop();
        if(x==min){ // min value now not exist in the stack so it become null
        minStack.pop();
            if(!minStack.isEmpty()){
                min =  minStack.peek();
            }else{ // is empty
                min=Integer.MAX_VALUE;
            }
        }
        
    }
    
    public int top() {
        return st.peek();
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
