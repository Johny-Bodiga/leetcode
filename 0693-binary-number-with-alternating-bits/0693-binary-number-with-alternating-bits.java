class Solution {
    public boolean hasAlternatingBits(int n) {
        int c=0,n1=n%2;
        n=n>>1;
        while(n>0){
            if(n%2!=n1){
                n1=n%2;
            }
            else{
                c=1;
                break;
            }
            n=n>>1;
        }
        if(c==0)
        return true;
        else
        return false;
    }
}