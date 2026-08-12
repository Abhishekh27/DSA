class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        int start = 0;
        long sum = 0;
        long max = 0;

        for (int end = 0; end < nums.length; end++) {

            // If duplicate enters the window, remove from the left
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }

            // Add current element
            set.add(nums[end]);
            sum += nums[end];

            // Keep window size <= k
            if (end - start + 1 == k) {
                max = Math.max(max, sum);

                // Move window for next iteration
                set.remove(nums[start]);
                sum -= nums[start];
                start++;
            }
        }

        return max;
    }
}