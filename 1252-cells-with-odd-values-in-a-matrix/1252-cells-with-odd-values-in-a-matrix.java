class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        int row,col;
        for(int index[]:indices){
            row = index[0];
            col = index[1];
            rowInc(arr,row,n);
            colInc(arr,col,m);
        }
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] % 2 != 0)  count++;
            }
        }
        return count;
    }
    static void rowInc(int arr[][],int row,int n){
        for(int i=0;i<n;i++){
            arr[row][i]++;
        }
    }
    static void colInc(int arr[][],int col,int m){
        for(int i=0;i<m;i++){
            arr[i][col]++;
        }
    }
        
}
