class Solution {
    public int lengthOfLastWord(String s) {
     //String[] ans = s.trim().split("\\s+");
     String []ans = s.trim().split("\\s+");
     return ans[ans.length-1].length();
    }
}