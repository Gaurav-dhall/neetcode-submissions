class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int curr=nums[i];

            int j=i+1;
            int k=n-1;

            while(j<k){
                if(nums[j]+nums[k]<-curr){
                    j++;
                    continue;
                }
                if(nums[j]+nums[k]>-curr){
                    k--;
                    continue;
                }

                List<Integer> temp = new ArrayList<>();

                temp.add(curr);
                temp.add(nums[j]);
                temp.add(nums[k]);

                ans.add(temp);

                while(j < k && nums[j] == nums[j+1]) j++;
                while(j < k && nums[k] == nums[k-1]) k--;
                j++;
                k--;
            }
        }

        return ans;
    }
}