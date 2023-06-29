class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0,i=0,j=1;
        int ans[] = new int[nums.length];
        while(k<2*n){
            while(k<n){
                ans[i] = nums[k];
                i+=2;
                k++;
            }
            ans[j] = nums[k];
            j+=2;
            k++;
        }
        return ans;
    }

}