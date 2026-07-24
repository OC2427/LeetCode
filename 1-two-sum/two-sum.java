class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] targets = new int[2];
        for (int i = 0; i < len-1; i++){
            for (int j = i + 1; j < len; j++){
                if (nums[i] + nums[j] == target){
                    targets[0] = i;
                    targets[1] = j;
                }
            }
        }
    return targets;
    }
}