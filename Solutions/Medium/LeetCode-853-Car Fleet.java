class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1)
            return 1;
        
        int[][] pairs = new int[position.length][2];
        for(int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        
        // O(NLGN)
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[0]));
        
        Stack<Double> stack = new Stack<>();
        
        for(int i = position.length - 1; i >= 0; i--) {
            double time = (double)(target - pairs[i][0]) / pairs[i][1];
            
            if(!stack.isEmpty() && time <= stack.peek()) {
                continue;
            }
            else {
                stack.push(time);
            }
        }
        
        
        return stack.size();
        
        
    }
}
