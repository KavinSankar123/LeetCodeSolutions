class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++) {
            String temp = tokens[i];
            if(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                int x = stack.pop();
                int y = stack.pop();
                
                if(temp.equals("+")) 
                    stack.push(y + x);                
                else if(temp.equals("-")) 
                    stack.push(y - x);
                else if(temp.equals("*")) 
                    stack.push(y * x);
                else 
                    stack.push(y / x);       
            }
            else 
                stack.push(Integer.parseInt(temp));
            
        }
        
        return stack.pop();
    }
}
