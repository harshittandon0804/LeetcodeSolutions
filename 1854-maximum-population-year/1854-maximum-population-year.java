class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int count = 0;
        int year = 0;
        int[] pop = new int[101];
        for (int i = 1950; i < 2050; i++) {
            count = 0;
            for (int[] log : logs){
                if (log[0] <= i && log[1] > i)
                    count++;
            }
            pop[i - 1950] = count;
        }
        for (int j : pop) {
            max = Math.max(max, j);
        }
        for (int i = 0; i < pop.length; i++) {
            if (pop[i] == max) {
                year = i + 1950;
                break;
            }
        }
        return year;
    }
}