class Solution {
    public void sortColors(int[] nums) {
        int j = 1, temp;
        if ( nums.length < 2) return;
        for (int i = 0; i < nums.length; i++){
            if (nums[j] < nums[i]){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            };
            if (j == nums.length - 1) j = i + 1;
            else{
                i -= 1;
                j += 1;
            }
        }
    }
}