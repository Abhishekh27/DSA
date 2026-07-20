class Solution {
    public int[] sortedSquares(int[] nums) {
        // int [] ans = new int[nums.length];
        // int [] ans = Arrays.sort(nums);
        // for(int i = 0;i<nums.length;i++){
        //     nums[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
//         if (Math.abs(nums[left]) > Math.abs(nums[right])) {
//     // Left has the larger square
// }
        int [] ans = new int[nums.length];
        int left =0;
        int right = nums.length - 1;
        int last = ans.length -1;
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[last] = nums[left]*nums[left];
                left++;
                last--;
            }
            else{
                ans[last] = nums[right]*nums[right];
                right--;
                last--;
            }
        }  
        return ans;
    }
}