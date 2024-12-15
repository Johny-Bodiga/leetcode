class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1],i=0,j=0,c=0;
        for(i=0;i<=n;i++){
            c=0;
            j=i;
            while(j>0){
                if(j%2==1)
                c++;
                j=j>>1;
            }
           // System.out.print(i);
            arr[i]=c;
        }
        return arr;
    }
}