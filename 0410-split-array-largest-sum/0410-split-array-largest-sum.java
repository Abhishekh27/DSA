class Solution {
      public int splitArray(int [] nums , int m){
        int start = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        //binary search 
        while(start<end){
            //Try for the middle as the potential ans
            int mid = start +(end - start)/2;
            // Calculate how many pices we can devide this with this max sum
           int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(sum  + num > mid ){
                    // you can not add this in this subarray, make new one 
                    // say you add this num in ne subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return end;       
    }
}