class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            int curr=nums[mid];
            if(curr>=nums[l]&&curr<=nums[r]){
                return nums[l];
            }

            if(mid>0&&mid<n-1&&curr<nums[mid-1]&&curr<nums[mid+1]){
                return curr;
            }

            if(curr>=nums[l]&&curr>nums[r]){
                l=mid+1;
            }

            if(curr<nums[l]&&curr<=nums[r]){
                r=mid-1;
            }
        }

        return 0;
    }
}
