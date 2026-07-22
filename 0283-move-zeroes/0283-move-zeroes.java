class Solution {
    public void moveZeroes(int[] nums) {

        // int slow = 0;
        // int fast = 0;
        // while (fast < nums.length) {
        //     if (nums[fast] != 0) {
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        //     fast++;
        // }
        // while (slow < nums.length) {
        //     nums[slow] = 0;
        //     slow++;
        // }
        // int slow = 0;
        // int fast = 0;
        // while(fast < nums.length){
        //     if(nums[fast] != 0){
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        //     fast++;
        // }
        // while(slow < nums.length){
        //     nums[slow] = 0;
        //     slow++;
        // }
        // int slow = 0;
        // int fast = 0;
        // while(fast < nums.length){
        //     if(nums[fast] != 0 ){
        //         nums[slow] = nums[fast];
        //         slow++;
        //     }
        //     fast++;
        // }
        // while(slow < nums.length){
        //     nums[slow] = 0;
        //     slow++;
        // }
        int i=0;
        for(int j = 0;j<nums.length;j++ ){
            if(nums[j] != 0){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
        }
    }
}