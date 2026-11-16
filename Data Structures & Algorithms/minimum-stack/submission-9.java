class MinStack {
    private Stack<Integer> st;
    private PriorityQueue<Integer> pq;
    private Map<Integer,Integer> hash;

    public MinStack() {
        this.st=new Stack<>();
        this.pq=new PriorityQueue<>((a,b)->Integer.compare(a,b));
        this.hash= new HashMap<>();
    }
    
    public void push(int val) {
        st.push(val);
        pq.offer(val);
        hash.put(val,hash.getOrDefault(val,0)+1);
       
    }
    
    public void pop() {
        if(st.peek()==pq.peek()){
            pq.poll();
        }
        int val=st.pop();
        hash.put(val,hash.get(val)-1);
        if(hash.get(val)==0){
            hash.remove(val);
        }

        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       while(!hash.containsKey(pq.peek())){
            pq.poll();
       }


       return pq.peek();
    }
}
