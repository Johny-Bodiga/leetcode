class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i=0,n=arr.length;
        for(i=0;i<n-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
                return true;
        }
        return false;
    }
}