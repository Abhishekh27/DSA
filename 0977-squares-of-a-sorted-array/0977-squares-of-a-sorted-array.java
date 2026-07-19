class Solution {
    public int[] sortedSquares(int[] nums) {
        // int [] ans = new int[nums.length];
        // int [] ans = Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){

            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}