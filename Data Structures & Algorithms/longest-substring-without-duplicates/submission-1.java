class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash= new HashSet<>();
        int n=s.length();
        if(n==0){
            return 0;
        }
        int l=0;
        hash.add(s.charAt(l));
        int r=1;
        int maxLen=1;
        while(r<n){
            while(r<n&&!hash.contains(s.charAt(r))){
                hash.add(s.charAt(r));
                r++;
            }

            maxLen=Math.max(r-l,maxLen);

            while(r<n&&hash.contains(s.charAt(r))){
                hash.remove(s.charAt(l));
                l++;
            }
        }

        return maxLen;
    }
}
