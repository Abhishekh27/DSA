class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        // int right = 0;
        int max = 0;
        int count =0;
        for(int right = 0;right<s.length();right++){
            if("aeiou".indexOf(s.charAt(right)) != -1){
                count++;
            }
            while(right -left +1 > k){
                if("aeiou".indexOf(s.charAt(left)) != -1){
                count--;
            }
                left++;
        }
        max = Math.max(max,count);
        }
        return max;
    }
}