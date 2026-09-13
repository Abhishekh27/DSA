class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int [] count1 = new int[26];
    int [] count2 = new int[26];
/*1. Count characters in s1
2. Create a window of size s1.length()in s2
3. Count characters in the window
4. Compare frequencies
5. If same → true
6. Otherwise slide window */
    int start  = 0;
    int end  = 0;
    while(end< s1.length()){
        count1[s1.charAt(end)-'a']++;
        end++;
    }
    // end = 0;
    for(end= 0;end<s2.length();end++){
        count2[s2.charAt(end)-'a']++;
        if(end - start+1>s1.length()){
            count2[s2.charAt(start)-'a']--;
            start++;
        }
        if(end - start + 1 == s1.length()){
            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
    }
    return false;
    }
}