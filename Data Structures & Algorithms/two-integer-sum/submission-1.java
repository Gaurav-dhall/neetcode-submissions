class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hash= new HashMap<>();
        int [] ans= new int[2];

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                int i2=hash.get(target-nums[i]);
                ans[0]=i2<i?i2:i;
                ans[1]=i2<i?i:i2;
                break;
            }

            hash.put(nums[i],i);
        }

        return ans;
    }
}
