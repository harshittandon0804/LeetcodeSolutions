class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
            max = candies[i];
            for(int j=0;j<candies.length;j++){
                if(candies[j]>max)  max=candies[j];
            }
            if(max==candies[i]) ans.add(true);
            else ans.add(false);
            candies[i]-=extraCandies;
        }
        return ans;
    }
}