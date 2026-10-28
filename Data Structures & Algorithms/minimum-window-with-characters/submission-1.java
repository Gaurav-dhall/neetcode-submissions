class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int [] need = new int[128];
        int [] window= new int[128];

        int required=0;

        for(char ch:t.toCharArray()){
            need[ch]++;
        }

        for(int count : need){
            if(count>0){
                required++;
            }
        }

        int left=0;
        int minLen=Integer.MAX_VALUE;
        int start=-1;

        int formed=0;

        for(int r=0;r<s.length();r++){
            window[s.charAt(r)]++;

            if(need[s.charAt(r)]>0&&need[s.charAt(r)]==window[s.charAt(r)]){
                formed++;
            }

            while(formed==required){
                int len=r-left+1;
                if(len<minLen){
                    minLen=len;
                    start=left;
                }

                window[s.charAt(left)]--;

                if(need[s.charAt(left)]>0&&window[s.charAt(left)]<need[s.charAt(left)]){
                    formed--;
                    
                }

                left++;
            }

           
        }

        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);


    }
}
