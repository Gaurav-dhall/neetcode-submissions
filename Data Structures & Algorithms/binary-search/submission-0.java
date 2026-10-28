class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(nums[mid]<target){
                l=mid+1;
                continue;
            }

             if(nums[mid]>target){
                r=mid-1;
                continue;
            }

            return mid;
        }

        return -1;
    }
}
