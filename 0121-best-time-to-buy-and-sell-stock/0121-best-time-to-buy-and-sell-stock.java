class Solution {
    public int maxProfit(int[] prices) {
//         class Solution {
//     public int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int price : prices) {
//             if (price < minPrice) {
//                 minPrice = price;
//             } else {
//                 maxProfit = Math.max(maxProfit, price - minPrice);
//             }
//         }
//         return maxProfit;
//     }
// }
        // int min = price[0];
        // int max = 
        // for (int i = 0; i<price.length; i++){
        //     if(min > price[i]){
        //         min = price[i];
        //     }
        // }
        int bprice = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < bprice){
                bprice = prices[i];
            }
            else{
                int cprofit = prices[i] - bprice;
                profit = Math.max(cprofit,profit);
            }
        }
          return profit;
    }
}