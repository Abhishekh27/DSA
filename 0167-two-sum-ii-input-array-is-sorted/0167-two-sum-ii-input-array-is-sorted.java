class Solution {
    public int[] twoSum(int[] num, int target) {
        // int start = 0;
        // int end = num.length -1;
        // while(start <= end){
        //     int mid = start +(end-start)/2;}
        int left = 0;
        int right = num.length -1;
        while(left<right){
            int sum = num[left] + num[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else{
                return new int[]{left+1,right+1};    
            }
        }      
        return new int[]{-1,-1};
    }
}