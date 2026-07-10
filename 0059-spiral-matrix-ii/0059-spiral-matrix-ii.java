class Solution {
    public int[][] generateMatrix(int n) {
        int [][] ans = new int[n][n];
        
         int top = 0;
        int bottom = ans.length - 1;
        int left = 0;
        int right = ans[0].length - 1;
            int num=1;

        while (top <= bottom && left <= right) {
            // Left -> Right
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;

            // Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num;
                num++;
            }
            right--;
            // Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = num;
                    num++;
                }
                bottom--;
            }
            // Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = num;
                    num++;
                }
                left++;
            }
        }
        return ans;
    }
}
    