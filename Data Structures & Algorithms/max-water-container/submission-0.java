class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r=n-1;
        int maxWater=0;

        while(l<=r){
            int currArea=(r-l)*Math.min(heights[l],heights[r]);
            maxWater=Math.max(maxWater,currArea);

            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxWater;
    }
}
