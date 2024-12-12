class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        while(x>0 || y>0){
            if(x%2!=y%2)
            c++;
            x=x>>1;
            y=y>>1;
        }
        return c;
    }
}