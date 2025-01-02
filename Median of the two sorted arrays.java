class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int sum = m+n;
        int[] nums3 = new int[sum]; 
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n){
            if (nums1[i] <= nums2[j]){
                nums3[count++] = nums1[i++];
            } else {
                nums3[count++] = nums2[j++];
            }
        }
        while (i < m) {
            nums3[count++] = nums1[i++];
        }
        while (j < n) {
            nums3[count++] = nums2[j++];
        }
        if (sum % 2 == 0) {
            int mid1 = nums3[sum / 2 - 1];
            int mid2 = nums3[sum / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) nums3[sum / 2];
        }
    }
}
