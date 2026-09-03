class Solution {
    public boolean uniformArray(int[] nums1) {
        Arrays.sort(nums1);
        int i=0;
        if(nums1[0]%2==1){
            return true;
        }else{
            while(i<nums1.length){
                if(nums1[i]%2==1){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}