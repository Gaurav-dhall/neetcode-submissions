class Pair{
    int temp;
    int ind;

    Pair(int _temp,int _ind){
        this.temp=_temp;
        this.ind=_ind;
    }
}


class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> st= new Stack<>();
        int n=temperatures.length;

        int [] ans= new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&temperatures[i]>=st.peek().temp){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek().ind-i;
            }

            st.push(new Pair(temperatures[i],i));
        }

        return ans;
    }
}
