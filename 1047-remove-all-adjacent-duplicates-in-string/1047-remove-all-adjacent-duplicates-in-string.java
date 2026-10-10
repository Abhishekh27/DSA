class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(!stack.isEmpty()&&stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}