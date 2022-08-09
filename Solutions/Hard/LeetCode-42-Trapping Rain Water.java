class Solution {
    public int trap(int[] height) {
        // Time Complexity --> O(N)
        // Space Complexity --> O(1)
        
        // indices
        int left = 0;
        int right = height.length - 1;
        
        // values
        int maxLeft = height[0];
        int maxRight = height[height.length - 1];
        int rain = 0;
        
        while (left < right) {
            int min = Math.min(maxLeft, maxRight);
            
            if(height[left] <= height[right]) {
                left++;
                
                if(min - height[left] > 0) 
                    rain += min - height[left];
                
                maxLeft = Math.max(maxLeft, height[left]);
            }
            else if(height[left] > height[right]) {
                right--;
                
                if(min - height[right] > 0) 
                    rain += min - height[right];
                
                maxRight = Math.max(maxRight, height[right]);
            }
        }
        
        return rain;
    }
}
