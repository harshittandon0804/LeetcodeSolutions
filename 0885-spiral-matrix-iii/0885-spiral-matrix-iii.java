class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows*cols][2];
        int r = rStart;
        int c = cStart;
        int[][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
        ans[0][0] = rStart;
        ans[0][1] = cStart;
        int ind = 0;
        int count = 1;
        int step;
        int seq = 2;
        while(count<rows*cols){
            step = seq/2;
            for(int i=0;i<step;i++){
                r+=dir[ind][0];
                c+=dir[ind][1];
                if((r>=0 && r<rows) && (c>=0 && c<cols)){
                    ans[count][0] = r;
                    ans[count][1] = c;
                    count++;
                 }
            }
            if(ind<3)   ind++;
            else        ind = 0;
            seq++;
        }
        return ans;
    }
}