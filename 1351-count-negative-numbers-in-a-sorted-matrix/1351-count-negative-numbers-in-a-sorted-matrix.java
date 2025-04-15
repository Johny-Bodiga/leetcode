class Solution {
    public int countNegatives(int[][] grid) {
          int n=grid.length,m=grid[0].length,i=0,c=0,l=0,h=m-1,mid=0;
          for(i=0;i<n;i++){
               l=0;
               h=m-1;
               while(l<=h){
                     mid=(l+h)/2;
                     if(mid==0 && grid[i][mid]<0){
                     c+=m;
                     break;
                     }
                     else if(mid==m-1 && grid[i][mid]>=0){
                        break;
                     }
                    if(grid[i][mid]<0 && grid[i][mid-1]>=0)
                    {
                        c+=m-mid;
                        break;
                    }
                    else if(grid[i][mid]>=0)
                    l=mid+1;
                    else
                    h=mid-1;
               }
               //System.out.println("1");
          }
          return c;
    }
}