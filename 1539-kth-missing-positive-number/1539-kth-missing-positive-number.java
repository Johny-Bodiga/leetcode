class Solution {
    public int findKthPositive(int[] arr, int k) {
        int arr1[]=new int[10000],i=0;
        for(i=0;i<arr.length;i++){
            arr1[arr[i]]=1;
        }
        for(i=1;i<10000;i++){
            if(arr1[i]!=1)
            k-=1;
            if(k==0)
            return i;
            
        }
        return 1000;
    }
}