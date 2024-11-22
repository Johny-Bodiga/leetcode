class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int i=0,l=0,ans=0,n=answerKey.length(),t=0,f=0;
        for(i=0;i<n;i++){
            char c=answerKey.charAt(i);
            if(c=='T')
            t++;
            else
            f++;
            
            while(Math.min(t,f)>k){
                char c1=answerKey.charAt(l);
                if(c1=='T')
                t--;
                else
                f--;
                l++;
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}