class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,ans=0,mid=0,i=0,hi=0;
        for(i=0;i<piles.length;i++){
            if(piles[i]>hi)
            hi=piles[i];
        }

        while(l<=hi){
               mid=l+(hi-l)/2;
               long c=0;
               for(i=0;i<piles.length;i++){
                    if(piles[i]%mid>0){
                        c+=piles[i]/mid+1;
                    }
                    else
                    c+=piles[i]/mid;
               }
            //System.out.println(mid+" "+c+" "+l+" "+hi);
               if(c>h){
                l=mid+1;
               }
               else 
               {
                ans=mid;
                hi=mid-1;
               }
        }
        return ans;
    }
}