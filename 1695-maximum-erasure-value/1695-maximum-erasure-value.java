class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set =new HashSet<>();
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int right = 0; right<nums.length ; right++){
            sum = sum + nums[right];
            while(set.contains(nums[right])){
                sum-=nums[left];
                // map.remove(nums[left]);
                set.remove(nums[left]);
                left++;
            }
            // map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            set.add(nums[right]);
            max = Math.max(max,sum);
        }
        return max;
    }
}