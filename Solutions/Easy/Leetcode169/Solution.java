class Solution {
    public int majorityElement(int[] nums) {   
        // Solution in O(N) time and O(1) space
        int candidate = nums[0];
        int count = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) 
                count++;
            else {
               count--;
               if (count == 0) {
                   candidate = nums[i];
                   count = 1;
               }
            }
        }
        
        return candidate;                   
        
     // Alternate approach below --> O(NLgN) + O(N)   
//         Arrays.sort(nums);
        
//         int prev = Integer.MAX_VALUE;
//         int runningMaj = nums[0];
        
//         int counterPrev = 0;
//         int counterCurr = 1;
        
        
//         for(int i = 1; i < nums.length; i++) {
//             if (runningMaj == nums[i]) {
//                 counterCurr++;
//                 if (counterCurr > nums.length / 2)
//                     return runningMaj;
//             }
//             else if (runningMaj != nums[i]) {
//                 prev = runningMaj;
//                 counterPrev = counterCurr;
                
//                 runningMaj = nums[i];
//                 counterCurr = 1;
//             }
                
//         }
        
//         if (counterPrev > counterCurr)
//             return prev;
//         else
//             return runningMaj;
    }
}
