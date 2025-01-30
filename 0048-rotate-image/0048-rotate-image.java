class Solution {
    public void rotate(int[][] matrix) {
        
        if(matrix.length==0 || matrix[0].length==0 || matrix==null){
            return;
        }
        int m=matrix.length;
        int n = matrix[0].length;      


        for(int first = 0,last=m-1 ;first<last; first++ , last-- ){
            int temp[]=matrix[first];
            matrix[first]=matrix[last];
            matrix[last]=temp;
        }  

        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


    }
}