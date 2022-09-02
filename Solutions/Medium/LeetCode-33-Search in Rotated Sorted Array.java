// O(lGN)
class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
        
            if(nums[mid] == target)
                return mid;
            
            
            if(nums[left] <= nums[mid]) { // in the left sorted array
                 if(target > nums[mid] || target < nums[left]) {
                     System.out.println();
                     left = mid + 1;
                 }
                else
                    right = mid - 1;
            }
            else { // in the right sorted array
                if(target > nums[right] || target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } 
        }
        
        return -1;
    }
}


// Idek, prob O(LGN) < Solution2 < O(N)
// finds the pivot index with linear search and then does binary search on both sides of the pivot index
class Solution2 {
    public int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target) return 0;
            else return -1;
        }
        
        int pivot = nums.length - 1;
        for(int i = 0; i < nums.length; i++) {
            if(i+1 <= nums.length - 1 && nums[i] > nums[i+1])
                pivot = i;
        }
        
        int index1 = binarySearch(nums, target, 0, pivot);
        int index2 = -1;
        if(pivot + 1 <= nums.length - 1)
            index2 = binarySearch(nums, target, pivot + 1, nums.length - 1);
        
        System.out.println(pivot);
        
        
        if(index1 != -1)
            return index1;
        else if(index2 != -1)
            return index2;
        
        return -1;
        
    }
    
    private static int binarySearch(int[] nums, int target, int start, int end) {
        int left = start;
        int right = end;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return -1;
     }
    
}
