class Solution {
    public int pivotIndex(int[] nums){
        // int i = nums.length -1;
        // int prefix_sum = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int  j = 0;
        //     int k = nums.length -1 ;
        //     while(j<=i; && k =  );
        int rightSum = 0;
        for(int n : nums){
            rightSum += n;
        }
        int leftSum = 0;
        for(int i=0; i < nums.length ; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}