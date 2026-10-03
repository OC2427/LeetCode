class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums2[count] = nums[i];
                count++;
            }
        }
        if (count > 0) for (int i = 0; i < count; i++) nums[i] = nums2[i];
        return count;
    }
}