class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        int n = cardPoints.length;
        for(int i =0;i<cardPoints.length;i++){
            sum += cardPoints[i];
        }
        int left = 0;
        int right = n-k;
        int sum2=0;
        for(int i = left;i<n-k;i++){
            sum2 += cardPoints[i];
        }
        int min = sum2;
        while(right< n){
            sum2 -= cardPoints[left];
            left++;
            sum2 +=cardPoints[right];
            right++;
        min = Math.min(min,sum2);
        }
        return sum - min;
    }
}