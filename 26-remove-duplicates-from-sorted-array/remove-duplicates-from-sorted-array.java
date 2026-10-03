class Solution {
    public int removeDuplicates(int[] nums) {
        int[] nums2 = new int[nums.length];
        nums2[0] = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums2[count] != nums[i]){
                count++;
                nums2[count] = nums[i];
            }
        }
        for (int i = 0; i <= count; i++) nums[i] = nums2[i];
        return count+1;
    }
}