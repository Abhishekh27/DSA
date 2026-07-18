class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int slow=0;
        // int fast = 0;
        for(int fast = 1 ; fast < nums.length ;fast++){
            if(nums[slow] != nums[fast]){
                nums[slow + 1] =nums[fast];
                slow++;       
            }
        }
         return slow+1;
    }
}