class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        int len = nums3.length, temp, i = 1;
        while (i < len){
            if (i == 0 || nums3[i] >= nums3[i-1]) i++;
            else{
                temp = nums3[i];
                nums3[i] = nums3[i-1];
                nums3[i-1] = temp;
                i--;
            }
        }
        if (len%2 != 0) return nums3[len>>1];
        return (nums3[len>>1] + nums3[(len>>1)-1]) / 2.0;
    }
}