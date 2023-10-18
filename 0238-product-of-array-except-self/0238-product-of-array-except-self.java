class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        int lprod = 1;
        int rprod = 1;
        //creating left and right arrays
        for(int i=0,j=n-1;i<nums.length && j>=0; i++, j--){
            lprod = lprod * nums[i];
            rprod = rprod * nums[j];
            left[i] = lprod;
            right[j] = rprod;
        }
        ans[0] = right[1]; //Corner condition
        for(int i=1;i<n-1;i++){
            ans[i] = left[i-1] * right[i+1];
        }
        ans[n-1] = left[n-2];
        return ans;        
    }
}