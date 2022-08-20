class Solution {
    public int[] runningSum(int[] nums) {
        int curr = 0;
        
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i]; 
            nums[i] = curr;
        }
        
        return nums;
    }
}
