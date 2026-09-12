class Solution {
    public int characterReplacement(String s, int k) {
        int [] count = new int[26];
        int start=0;
        int end =0;
        int max = 0;
        int maxfreq = 0;
        while(end < s.length()){
            count[s.charAt(end) - 'A']++;
            maxfreq = Math.max(maxfreq,count[s.charAt(end)-'A']);
            if(end-start+1 - maxfreq >k){
                count[s.charAt(start)-'A']--;
                start++;
            }
            max = Math.max(max,end -start+1);
            end++;
        }
        return max;
    }
}