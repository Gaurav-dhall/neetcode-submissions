class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;


    public MinStack() {
        this.st=new Stack<>();
        this.min=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        st.push(val);
        if(val<=min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        int val=st.pop();
        if(min.peek()==val){
            min.pop();
        }
    }
    
    public int top() {
       return  st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
