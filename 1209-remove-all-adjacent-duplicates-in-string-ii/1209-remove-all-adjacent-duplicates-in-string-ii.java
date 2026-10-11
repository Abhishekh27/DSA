import java.util.Stack;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> chars = new Stack<>();
        Stack<Integer> counts = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!chars.isEmpty() && chars.peek() == c) {
                int count = counts.pop() + 1;

                if (count == k) {
                    chars.pop();
                } else {
                    counts.push(count);
                }
            } else {
                chars.push(c);
                counts.push(1);
            }
        }

        StringBuilder result = new StringBuilder();

    
        for (int i = 0; i < chars.size(); i++) {
            char c = chars.get(i);
            int count = counts.get(i);
            
            for (int j = 0; j < count; j++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}