class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int left = 0;
        int right = nums1.length;
        int total = nums1.length + nums2.length;
        int half = (total + 1) / 2;
        while (left <= right) {
            int cut1 = left + (right - left) / 2;
            int cut2 = half - cut1;
            int left1;
            int right1;
            int left2;
            int right2;
            // Find left1 and right1
            if (cut1 == 0) {
                left1 = Integer.MIN_VALUE;
            } else {
                left1 = nums1[cut1 - 1];
            }
            if (cut1 == nums1.length) {
                right1 = Integer.MAX_VALUE;
            } else {
                right1 = nums1[cut1];
            }
            // Find left2 and right2
            if (cut2 == 0) {
                left2 = Integer.MIN_VALUE;
            } else {
                left2 = nums2[cut2 - 1];
            }
            if (cut2 == nums2.length) {
                right2 = Integer.MAX_VALUE;
            } else {
                right2 = nums2[cut2];
            }
            // Correct partition
            if (left1 <= right2 && left2 <= right1) {
                // Odd number of elements
                if (total % 2 != 0) {
                    return Math.max(left1, left2);
                }
                // Even number of elements
                double leftMax = Math.max(left1, left2);
                double rightMin = Math.min(right1, right2);
                return (leftMax + rightMin) / 2;
            }
            // cut1 is too far right
            else if (left1 > right2) {
                right = cut1 - 1;
            }
            // cut1 is too far left
            else {
                left = cut1 + 1;
            }
        }
        return 0;      
    }
}