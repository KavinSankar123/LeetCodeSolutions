class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char c = s.charAt(0);
        
        if (c ==  ')' || c == ']' || c == '}')
            return false;
        else if (s.length() % 2 != 0)
            return false;
        
        int counter = 0;
        while(counter < s.length()) {
            c = s.charAt(counter);
            
            if (!stack.empty() && stack.peek() == '(' && c == ')') {
                stack.pop();
            }
            else if (!stack.empty() && stack.peek() == '{' && c == '}') {
                stack.pop();
            }
            else if (!stack.empty() && stack.peek() == '[' && c == ']') {
                stack.pop();
            }
            else
                stack.push(c);
            
            counter++;
        }
        
        return stack.isEmpty();
        
    }
}
