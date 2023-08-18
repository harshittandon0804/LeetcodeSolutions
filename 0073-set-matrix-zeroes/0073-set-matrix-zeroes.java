import java.util.Collections;
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        fillRows(matrix,rows);
        Collections.sort(cols);
        fillCols(matrix,cols);       
    }
    static void fillRows(int[][] mat, ArrayList<Integer> rows){
        if(rows.size()==0)  return;
        int row_no = rows.get(0);
        for(int i = 0;i<rows.size();i++){
            if(rows.get(i)>=row_no){
                for(int j=0;j<mat[0].length;j++){
                    mat[rows.get(i)][j] = 0;
                }
                row_no++;
            }
        }
    }
    static void fillCols(int[][] mat, ArrayList<Integer> cols){
        if(cols.size()==0)  return;
        int col_no = 0;
        for(int i=0;i<cols.size();i++){
            if(cols.get(i)>=col_no){
                for(int j = 0;j<mat.length;j++){
                    mat[j][cols.get(i)] = 0;
                }
                col_no++;
            }
        }
    }
}