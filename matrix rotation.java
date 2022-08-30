class Solution {
   
    public void transpose(int[][] matrix){

     int temp=0;
        for(int i=0;i<matrix.length;i++){

            for(int j=i;j<matrix[0].length;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
    }
    public void reverse(int[][]matrix){

    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;

                
            }

        }
    }
     public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
        
    }

}
