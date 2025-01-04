class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,f=0,n=numbers.length,l=n-1,arr[]=new int[2],sum=0;
        while(f<l){
            sum=numbers[f]+numbers[l];
            if(sum==target)
            {
                arr[0]=f+1;
                arr[1]=l+1;
                break;
            }
            else if(sum<target)
            f++;
            else
            l--;
        }
        return arr;
    }
}