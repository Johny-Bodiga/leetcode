class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt=0,n=0;
        while(c>0 || a>0 || b>0){
             n=c%2;
             if(n==1){
                if(a%2==0 && b%2==0)
                cnt++;
             }
             else{
                if(a%2==1 && b%2==1)
                cnt+=2;
                else if((a%2==0 && b%2==1) || (a%2==1 && b%2==0))
                cnt+=1;
             }
             c=c>>1;
             a=a>>1;
             b=b>>1;

        }
        return cnt;
    }
}