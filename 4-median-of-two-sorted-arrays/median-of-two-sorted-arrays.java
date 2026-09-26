class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        int len = nums3.length, temp;
        if (len == 1) return (double)nums3[0];
        else{
            for (int i = 0; i < len - 1; i++){
                for (int j = i + 1; j < len; j++){
                    if (nums3[i] > nums3[j]){
                        temp = nums3[i];
                        nums3[i] = nums3[j];
                        nums3[j] = temp;
                    }
                }
            }
            if (len%2 != 0) return nums3[len>>1];
            return (nums3[len>>1] + nums3[(len>>1)-1]) / 2.0;
        }
    }
}