class Solution {
    public int countGoodSubstrings(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int count = 0;
    for (int end =0 ; end<s.length();end++ ){
        char ch = s.charAt(end);
        set.add(ch);
        if(end - start +1==3 ){
            char a = s.charAt(start);
            char b = s.charAt(start+1);
            char c = s.charAt(end);
            if(a !=b && b !=c && c!=a){
                count++;
            }
            start++;  
        }
    }    
    return count;
    }
}