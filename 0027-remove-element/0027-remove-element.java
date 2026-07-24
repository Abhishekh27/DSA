class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        int le = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                nums[le] = nums[i];
                le++;
            }
        }
       return le;
    }
}