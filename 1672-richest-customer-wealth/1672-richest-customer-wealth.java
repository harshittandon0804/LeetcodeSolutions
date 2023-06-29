class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int j=0;j<accounts[0].length;j++)
            max += accounts[0][j];
        for(int row = 1; row<accounts.length ; row++){
            int sum = 0;
            for(int col = 0; col<accounts[0].length ; col++){
                sum += accounts[row][col];
            }
            if(sum>max) max = sum;
        }
        return max;
    }
}