class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int j =0;
        // for(int i = 1;i<nums.length;i++){
        //     if(nums[j] == nums[i]){
        //        return true;

        //     }
        //     j++;
        // // return false;
        // }
        // return false;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}