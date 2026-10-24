class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int n=s.length();
        if(n==0){
            return true;
        }
        int r=s.length()-1;

        s=s.toLowerCase().strip();

        while(l<=r){
           

            if(l<n-1&&!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(r>0&&!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }

             if(l<n-1&&r>0&&s.charAt(l)!=s.charAt(r)){
                return false;
            }

            l++;
            r--;

        }

        return true;
    }
}
