class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int [] nse=new int[n];
        int [] pse = new int[n];
        int maxHeight=Integer.MIN_VALUE;

        Stack<Integer> st= new Stack<>();

        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&&heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
            }
            else{
                nse[i]=st.peek();
            }

            st.push(i);
        }

        // for(int i=0;i<nse.length;i++){
        //     System.out.print(nse[i]);
        // }

        st.clear();

         for(int i=0;i<n;i++){

            while(!st.isEmpty()&&heights[i]<=heights[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
            }
            else{
                pse[i]=st.peek();
            }

            st.push(i);
        }

        //  for(int i=0;i<nse.length;i++){
        //     System.out.print(pse[i]);
        // }

        for(int i=0;i<n;i++){
            maxHeight=Math.max(maxHeight,(nse[i]-pse[i]-1)*heights[i]);
        }


        return maxHeight;
    }
}
