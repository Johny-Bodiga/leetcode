class Solution {
    public int findComplement(int num) {
        int ans=0,c=0;
        while(num>0){
            if(num%2==0){
                ans|=(1<<c);
            }
            c++;
            num=num>>1;
        }
        return ans;
    }
}