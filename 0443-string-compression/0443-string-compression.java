class Solution {
    public int compress(char[] chars) {
       int read = 0;
        int write = 0;
        while(read<chars.length){
            char current = chars[read];
            int start = read;
            while(read <chars.length && chars[read] == current){
                read++;
            }
            chars[write++] = current;
            int count = read - start;
            if(count >1){
                String countStr = String.valueOf(count);
                for(char c : countStr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}