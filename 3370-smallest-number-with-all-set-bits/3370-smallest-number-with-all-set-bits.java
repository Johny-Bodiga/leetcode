class Solution {
    public int smallestNumber(int n) {
        int i=0,num=0,c=0;
        for(i=n;i<=100000000;i++){
            num=i;
            c=0;
            while(num>0){
                if(num%2==0){
                    c=1;
                break;
                }
            num=num>>1;
            }
            if(c==0)
            return i;
        }
        return -1;
    }
}