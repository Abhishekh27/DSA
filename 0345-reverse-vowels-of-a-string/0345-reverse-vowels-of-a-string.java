class Solution {
     private boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
       }
    public String reverseVowels(String s) {
        char [] ch = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(start < end && !isVowel(ch[start])){
                start++;
            }
            while(start < end && !isVowel(ch[end])){
                end--;
            }
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }      
}