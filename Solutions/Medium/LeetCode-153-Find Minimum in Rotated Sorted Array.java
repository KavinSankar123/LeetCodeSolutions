class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        int currMin = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            currMin = Math.min(currMin, nums[mid]);
            
            if(nums[mid] >= nums[left] && nums[mid] >= nums[right])  // in the left sorted portion of the array
                left = mid + 1;
            else
                right = mid - 1;   
        }
        
        return currMin;
    }
}
