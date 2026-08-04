class Solution {
    public void rotate(int[] nums, int k) {
        // int left =0;
        // int right = nums.length -1;
        // while(left < right){
        //     nums[left] = 
        // }
        // if(k>nums.length) {
            k = k%nums.length;
        // }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
        static void reverse(int [] nums , int start ,int end){
            while(start < end){
                // swap like this
                // start = start^end;
                // end = start^end;
                // start = start^end;
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    }
