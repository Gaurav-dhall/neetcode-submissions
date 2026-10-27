class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = s1.length();

        int[] hash = new int[26];

        for (int i = 0; i < l; i++) {
            hash[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = 0;
        while (j - i + 1 != l) {
            j++;
        }

        while (j < s2.length()) {
            int k=i;
            int [] hash2= new int[26];

            while(k<=j){
               hash2[s2.charAt(k)-'a']++;
               k++;
            }
            boolean match=true;

            for(int m=0;m<26;m++){
                if(hash[m]!=hash2[m]){
                    match=!match;
                    break;
                }
            }

            if(match){
                return true;
            }

            i++;
            j++;
        }

        return false;
    }
}
