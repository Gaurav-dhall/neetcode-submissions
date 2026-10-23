class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] freq= new int[2001];
        int [] ans= new int[k];
        int maxFreq=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
            freq[nums[i]+1000]++;
            maxFreq=Math.max(maxFreq,freq[nums[i]+1000]);
       }

       List<List<Integer>> no= new ArrayList<>(); 
       for(int i=0;i<=maxFreq;i++){
        no.add(new ArrayList<>());
       }

       for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                no.get(freq[i]).add(i-1000);
            }
       }

       int knew=0;

       for(int i=no.size()-1;i>=0;i--){
        if(knew==k){
            break;
        }
            if(no.get(i).size()>0){
                for(int j=0;j<no.get(i).size();j++){
                    ans[knew]=no.get(i).get(j);
                    knew++;
                }
                
                
            }
       }

       return ans;


    }
}
