class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
            int target[] = new int[nums.length];
            for(int i=0;i<target.length;i++){
                int pos = index[i];
                if(pos<i) {
                    int j = i;
                    while (j > pos) {
                        target[j] = target[j - 1];
                        target[j - 1] = nums[i];
                        j--;
                    }
                }
                else{
                    target[i] = nums[pos];
                    }
            }
            return target;
    }
}