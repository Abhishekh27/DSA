
class Solution {
    public int[] twoSum(int [] nums, int target) {  
//         HashMap<Integer,Integer> ans = new HashMap<>();
//         for(int i = 0; i < nums.length ; i++){
//             int cont = target -nums[i];
//             if(ans.containsKey(cont)){
//                 return new int[]{ans.get(cont),i};
//             }
//             ans.put(nums[i],i);
//         }
// return new int[]{-1,-1};
            HashMap<Integer,Integer> ans = new HashMap<>();
            for(int i = 0; i< nums.length ; i++){
                int count = target - nums[i];
                if(ans.containsKey(count)){
                    return new int[]{ans.get(count),i};
                }
                ans.put(nums[i],i);
            }
            return new int[]{-1,-1};    
     }
}