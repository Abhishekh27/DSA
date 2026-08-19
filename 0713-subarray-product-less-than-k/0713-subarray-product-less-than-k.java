class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int start = 0;
        int end = 0;
        float pro = 1;
        int cou1 = 0; 
        while(end<nums.length){
            pro = pro*nums[end];
           while(pro>=k){
            pro/=nums[start];
            start++;
           }
           cou1+=end -start+1;
           end++;
            }
        return cou1;
    }
}