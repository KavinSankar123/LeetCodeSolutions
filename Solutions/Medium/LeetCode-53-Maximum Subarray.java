class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        int currMax = Integer.MIN_VALUE;
        int temp = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            if(temp > 0)
                temp += nums[i];
            else
                temp = nums[i];
            currMax = Math.max(currMax, temp);
        } 
        return currMax;        
    }
}
