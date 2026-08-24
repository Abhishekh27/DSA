class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int sum = 0;
        int max = 0;
        for(int right = 0; right<nums.length ; right++){
            sum = sum + nums[right];
            while(map.containsKey(nums[right])){
                sum-=nums[left];
                map.remove(nums[left]);
                left++;
            }
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            max = Math.max(max,sum);
        }
        return max;
    }
}