class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),n2=t.length(),i=0,c=0,c1=0;
        for(i=0;i<n2 && c<n;i++){
              if(s.charAt(c)==t.charAt(i)){
                c1++;
                c++;
              }
        }
        if(c1==n)
        return true;
        else
        return false;
    }
}