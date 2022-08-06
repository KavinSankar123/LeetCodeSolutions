class Solution {
    public int[] productExceptSelf(int[] nums) {  
        int[] arr = new int[nums.length];
    
        int left = 1;
        for(int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        
        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        
        return arr;
        
        
        
//nums-->        [4,3,2,1,2]
        
// prefix-->   [1,4,12,24,24]
//postfix-->    [12,4,2,2,1]   
        
// arr-->       [1,4,12,24,24]        
        
        // left = 1
    }
}
