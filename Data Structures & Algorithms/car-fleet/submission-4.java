class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;

        double [] duration=new double[n];
        for(int i=0;i<position.length;i++){
            duration[i]=(double)(target-position[i])/speed[i];
        }

        List<List<Double>> data= new ArrayList<>();
        for(int i=0;i<n;i++){
            data.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            data.get(i).add((double)position[i]);
            data.get(i).add(duration[i]);
        }

        Collections.sort(data,(a,b)->Double.compare(b.get(0),a.get(0)));

 

        int fleet=0;
        Stack<Double> st= new Stack<>();



        for(int i=0;i<data.size();i++){
           double curr= data.get(i).get(1);

           while(!st.isEmpty()&&st.peek()<curr){
            st.pop();
           }

           if(st.isEmpty()){
            fleet++;
           }
          
            st.push(curr);

        }

        return fleet;
    }
}
