class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hash= new HashSet<>();

        int maxLen=0;

        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            int currcpy=curr;
            hash.add(curr);
            int len=0;

            while(hash.contains(curr)){
                len++;
                curr--;
            }

            while(hash.contains(currcpy)){
                len++;
                currcpy++;
            }
            len--;
            
            

            maxLen=Math.max(maxLen,len);
        }

        return maxLen;

    }
}
