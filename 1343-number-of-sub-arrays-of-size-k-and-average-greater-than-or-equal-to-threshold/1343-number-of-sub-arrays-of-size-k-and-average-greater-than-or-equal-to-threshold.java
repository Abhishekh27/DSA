class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = k-1;
        int sum = 0;
        int count = 0;
        for(int i = start; i<= k-1; i++){
            sum += arr[i];
        }
        while(end < arr.length){
            if(sum/k >= threshold){
                count++;
            }
            if(end+1 < arr.length){
                sum = sum - arr[start] + arr[end +1];
            }
                end++;
                start++;       
        }
        return count;
    }
}
/*class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start = 0;
        int end = k - 1;
        int sum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        while (end < arr.length) {

            // Check current window
            if (sum / k >= threshold) {
                count++;
            }

            // Slide the window
            if (end + 1 < arr.length) {
                sum = sum - arr[start] + arr[end + 1];
            }

            start++;
            end++;
        }

        return count;
    }
}*/