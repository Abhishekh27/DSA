class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
    //    int i = 0;
    // int cou =1;
    //    for(int i =0;i<nums.length;i++){
    //     if(i ==(i+1)){
    //         cou++;
    int start =0;
    int end =nums.length -1;
    int mid = start  + (end - start)/2;
return nums[mid];
    }
}