class Solution {
    public int xorOperation(int n, int start) {
        int ans=0,i=0,num=0;
        for(i=0;i<n;i++){
            num=start+(2*i);
            ans^=num;
        }
        return ans;
    }
}