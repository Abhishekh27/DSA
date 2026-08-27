class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int num : nums){
            total+=num;
        }
        int target = total - x;
        if(target ==0){
            return nums.length;
        }
        int max=-1;
        int current = 0;
        int left = 0;
        for(int right =0;right<nums.length;right++){
            current+=nums[right];
            while(current > target && left <=right){
             current -=nums[left];
                left++;
            }
            if(current == target){
                max = Math.max(max,right -left +1);
            }
        }    
    if (max ==-1){
        return -1;
    }

        return nums.length -max;
    }
}