class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        
        int curr = Integer.MIN_VALUE;
        
        int counter = 1;
        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int area = h * (right - left);
             
            curr = Math.max(curr, area);
            
            if (height[left] < height[right])
                left++;
            else
                right--;
        }  
        return curr;
    }
}
