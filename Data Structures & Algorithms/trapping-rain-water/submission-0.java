class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] prefixMax = new int[n];
        int [] suffixMax= new int[n];
        

        for(int i=0;i<n;i++){
            if(i==0){
                prefixMax[i]=0;
                continue;
            }

            prefixMax[i]=Math.max(height[i-1],prefixMax[i-1]);
        }

        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                suffixMax[i]=0;
                continue;
            }

            suffixMax[i]=Math.max(height[i+1],suffixMax[i+1]);
        }
        // System.out.println(Arrays.toString(prefixMax));
        // System.out.println(Arrays.toString(suffixMax));

        int sum=0;

        for(int i=0;i<n;i++){
            int curr=Math.min(prefixMax[i],suffixMax[i])-height[i];
            if(curr<0){
                continue;
            }

            sum+=curr;
        }

        return sum;
    }
}
