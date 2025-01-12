class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int a=0,c=0,i=0,d=matrix[0].length-1,b=matrix.length-1;
       // System.out.println(d+" "+b);
        List<Integer> arr=new ArrayList<>(); 
        while(a<=b && c<=d){
            for(i=c;i<=d;i++){
               arr.add(matrix[a][i]);
            }
            a++;
            if(arr.size()==(matrix.length)*(matrix[0].length))
            break;
            for(i=a;i<=b;i++){
                System.out.println(i+" "+d);
               arr.add(matrix[i][d]);
            }
             d--;
            if(arr.size()==(matrix.length)*(matrix[0].length))
            break;
           
            if(d>=c){
            for(i=d;i>=c;i--){
               arr.add(matrix[b][i]);  
            }
            }
             b--;
            if(arr.size()==(matrix.length)*(matrix[0].length))
            break;
            if(b>=a){
            for(i=b;i>=a;i--){
               arr.add(matrix[i][c]);   
            }
            }
            c++;
           if(arr.size()==(matrix.length)*(matrix[0].length))
            break;
        }
        return arr;
    }
}