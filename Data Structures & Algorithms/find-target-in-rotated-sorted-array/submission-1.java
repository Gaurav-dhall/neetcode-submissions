class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;

        int l=0;
        int r=n-1;
        

        while(l<=r){
            int mid=l+(r-l)/2;

            int curr=nums[mid];

            if(curr>=nums[l]){
                if(target>=nums[l]){
                    if(target>curr){
                        l=mid+1;
                    }
                    else if(target<curr){
                        r=mid-1;
                    }
                    else{
                        return mid;
                    }
                }
                else{
                    l=mid+1;
                }

            }
            else{
                if(target<=nums[r]){
                    if(target>curr){
                        l=mid+1;
                    }
                    else if(target<curr){
                        r=mid-1;
                    }
                    else{
                        return mid;
                    }
                }
                else{
                    r=mid-1;
                }
            }


        }

        return -1;
    }
}
