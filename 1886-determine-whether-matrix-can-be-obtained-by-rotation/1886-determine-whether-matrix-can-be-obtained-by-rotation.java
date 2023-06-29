class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0;
        int n = mat.length;
        while(count<4){
            if(Arrays.deepEquals(mat,target))   break;
            transpose_mat(mat,n);
            horizontal_swap(mat,n);
            count++;
        }
        if(count==4) return false;
        return true;
    }
    static void transpose_mat(int[][] mat,int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    static void horizontal_swap(int[][] mat, int n){
        int i = 0;
        int j = n-1;
        int temp;
        while(i<=j){
            for(int k=0;k<n;k++){
                temp = mat[k][i];
                mat[k][i] = mat[k][j];
                mat[k][j] = temp;
            }
            i++;
            j--;
        }
    }        
}
