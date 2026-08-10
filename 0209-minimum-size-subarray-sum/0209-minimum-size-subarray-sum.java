class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int minLE = Integer.MAX_VALUE;
        while (right <= nums.length -1){
            sum += nums[right];
            // if(minL)
            while(sum >= target){
                sum -= nums[left];
                minLE = Math.min(minLE,right - left+1);
                left++; 
            }
            right++;
           
        }
         if(minLE == Integer.MAX_VALUE){ 
                return 0;
            }
        // if(minLE == nums.length && minLE < target){
        //     return 0;
        // }
        return minLE;
    }
}