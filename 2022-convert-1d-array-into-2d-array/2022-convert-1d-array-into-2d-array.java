class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int i=0,j=0;
        if(m*n==original.length){
            int arr[][]=new int[m][n],c=0;
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    arr[i][j]=original[c];
                    c++;
                }
            }
            return arr;
        }
        
            int arr1[][]=new int[0][0];
            return arr1;
        
    }
}