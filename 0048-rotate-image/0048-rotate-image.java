class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int t=0;
            int m=n-1;
            while(t<m){
                int temp=matrix[i][t];
                matrix[i][t]=matrix[i][m];
                matrix[i][m]=temp;
                t++;
                m--;
            }
        }
    }
}