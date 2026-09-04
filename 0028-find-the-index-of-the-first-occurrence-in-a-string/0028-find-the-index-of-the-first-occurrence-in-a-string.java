class Solution {
    public int strStr(String haystack, String needle) {
        // int start = 0;
        // int end = 0;
        // while(end < haystack.length()){
        //     char c = haystack.charAt(end);
        //     char d = needle.charAt(end);
        // }
        // char j = 0;
        // for(int i = 0;i<haystack.length();i++){
        // //     if(haystack.charAt(i)!=needle.charAt(j)){
        // //         j++;
        // //     }
        // for(int j = 0;j<needle.length();j++){
        //     if(haystack.charAt(i+j)==needle.charAt(j)){
        //         return i;
        //     }
        //     else{
        //       return  -1;
        //     }
        //     }
        // }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}
