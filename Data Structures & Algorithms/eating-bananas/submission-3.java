class Solution {

    public long findHour(int rate,int [] piles){
        long hours=0;

        for(int i=0;i<piles.length;i++){
            if(piles[i]<rate){
                hours++;
            }

            else{
               hours=piles[i]%rate==0?hours+piles[i]/rate:hours+piles[i]/rate+1;
            }


        }

        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int i=1;
       int j=piles[piles.length-1];
       int ans=0;

        while(i<=j){
            int mid=i+(j-i)/2;

            int curr=mid;
           long hoursTaken=findHour(curr,piles);

            if(hoursTaken<=h){
                ans=mid;
                j=mid-1;
                continue;
            }
            if(hoursTaken>h){
                i=mid+1;
                continue;
            }

            
        }

        return ans;
    }
}
