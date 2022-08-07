class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
              
        Arrays.sort(nums);
        
        int counter = 1;
        int prev = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                if (nums[i] == nums[i-1]+1) {
                    counter++;
                }
                else {
                    prev = Math.max(prev, counter);
                    counter = 1;
                }                  
            }
        }
        
        return Math.max(counter, prev);
    }
}
     
        
//        if (nums.length == 0)
//             return 0;
        
//         int min = Integer.MAX_VALUE;
//         int secondMin = Integer.MAX_VALUE;
        
//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;
        
//         Set<Integer> set = new HashSet<>();
        

        
        
        
//         for(int i: nums) {
//             set.add(i);

//             min = Math.min(i, min);
//             max = Math.max(i, max);
//         }

//         int currentStreak = 0;
//         int longestStreak = Integer.MIN_VALUE;
        
//         for(int i = min; i <= max; i++) {
//             if (set.contains(i)) {
//                 currentStreak++;
//                 set.remove(i);
//             }
//             else 
//                 currentStreak = 0;
            
            
//             longestStreak = Math.max(currentStreak, longestStreak);
            
//         }
        
//         return longestStreak; 
//     } 
