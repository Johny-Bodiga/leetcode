class Solution {
    public void setZeroes(int[][] matrix) {
        int c1=-1,i=0,j=0,n=matrix.length,m=matrix[0].length,row[]=new int[n],col[]=new int[m];
        for(i=0;i<n;i++){
            if(matrix[i][0]==0)
            c1=0;
        }
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                
                }

            }
        }
       /**   for(i=0;i<n;i++){
            for(j=0;j<m;j++){
             System.out.println(matrix[i][j]);
            }
          }**/
        for(i=0;i<n;i++){
            if(row[i]==1){
                for(j=0;j<m;j++){
                matrix[i][j]=0;
                }
            }
        }

        if (c1==0){
            for(i=0;i<n;i++)
            
            matrix[i][0]=0;
        }
        for(j=1;j<m;j++){
            if(col[j]==1){
                for(i=0;i<n;i++)
              
                matrix[i][j]=0;
            }
        }
        
       // return matrix;
    }
}