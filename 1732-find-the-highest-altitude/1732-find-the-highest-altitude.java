class Solution {
    public int largestAltitude(int[] gain) {
        int m=0,s=0,i=0;
        for(i=0;i<gain.length;i++){
            s+=gain[i];
            m=Math.max(m,s);
        }
        return m;
    }
}