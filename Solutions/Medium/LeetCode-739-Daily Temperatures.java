class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] temps = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        
        
        // O(N) time && O(N) space
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop();
                temps[index] = i - index;
            }
            stack.push(i);
        }
        
        return temps;
    }
}

// O(N^2) time complexity, O(1) space
 // int[] temps = new int[temperatures.length];
        // for(int i = 0; i < temperatures.length; i++) {
        //     int days = 1; 
        //     for(int j = i + 1; j < temperatures.length; j++) {
        //         if(temperatures[j] > temperatures[i]) {
        //             temps[i] = days;
        //             break;
        //         } 
        //         else 
        //             days++;   
        //     }
        // }
        // return temps;
