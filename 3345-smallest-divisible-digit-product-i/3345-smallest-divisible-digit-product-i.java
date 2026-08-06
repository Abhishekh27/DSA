class Solution {
    public int smallestNumber(int n, int t) {
        // int lastDig = 0;

        for(int i = n ; i < Integer.MAX_VALUE;i++){
        int c = i;
         int pro = 1;
            while(c>0){
                 int lastDig = c % 10;
                    pro *= lastDig;
                    c =  c/10;
            }
            if(pro%t ==0){
                return i;
            } 
        }
        
    return -1;
    }
}