class Solution {
    List<String> res = new ArrayList<>();     
    Stack<Character> stack = new Stack<>();   
    
    public List<String> generateParenthesis(int n) {     
        backTrack(0, 0, n);
        return res;
    }
    
    
    private void backTrack(int open, int close, int n) {
        if(open == n && close == n) {
            Iterator iterator = stack.iterator();
            String temp = "";
        
            while(iterator.hasNext()) 
                temp += iterator.next();
            res.add(temp);
        }
        
        if(open < n) {
            stack.push( '(' );
            backTrack(open + 1, close, n);
            stack.pop();   
        }
        if (close < open) {
            stack.push( ')' );
            backTrack(open, close + 1, n);
            stack.pop();
        } 
    }
}

