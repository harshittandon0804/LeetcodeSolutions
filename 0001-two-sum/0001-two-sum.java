class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
            }            
        }
        return null;
    }
}