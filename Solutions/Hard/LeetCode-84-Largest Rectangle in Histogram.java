class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 2) {
            if(heights[0] == 0) return heights[1];
            else if(heights[1] == 0) return heights[0];
            else return Math.min(heights[0], heights[1]) * 2;
        }
        
        
        Stack<ArrayList<Integer>> stack = new Stack<>(); // store the indices
        // ArrayList Format --> [index, height] 
        
        int currMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < heights.length; i++) {
            if(!stack.isEmpty() && heights[i] > stack.peek().get(1)) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(heights[i]);
                stack.push(temp);
            }
            else if(!stack.isEmpty() && heights[i] < stack.peek().get(1)) {
                int index = 0;
                int height = 0;
                while(!stack.isEmpty() && heights[i] <= stack.peek().get(1)) {
                    ArrayList<Integer> temp = stack.pop();
                    index = temp.get(0);
                    height = temp.get(1);
                    currMax = Math.max(currMax, (i - index) * height);
                }
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(index);
                temp.add(heights[i]);
                stack.push(temp);
            }
            else {
                currMax = Math.max(currMax, heights[i]);
                ArrayList<Integer> temp = new ArrayList<>();
                
                temp.add(i);
                temp.add(heights[i]);
                stack.push(temp);
            }
        }
        
        while(!stack.isEmpty()) {
            ArrayList<Integer> temp = stack.pop();
            int index = temp.get(0);
            int height = temp.get(1);
            currMax = Math.max(currMax, (heights.length - index) * height);
        }
        
        return currMax;
    }
}
