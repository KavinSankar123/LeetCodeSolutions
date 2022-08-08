
class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ind = new int[2];
        
        int left = 0;
        int right = numbers.length - 1;
        
        // Two Pointer Solution
        // Time complexity --> O(N)
        // Space complexity --> O(1)
        while (left < right)  {
            if (numbers[left]  + numbers[right] > target)  {
                right--;
                continue;
            }
            else if(numbers[left] + numbers[right] < target) {
                left++;
                continue;
            }
            else {
                ind[0] = left + 1;
                ind[1] = right + 1;
                return ind;
            }
            
        }
        
        return null;
    }
}



class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ind = new int[2];
        

        // Linear Scan & Binary Search Solution
        // Time complexity --> O(NlogN)   (for every num, do a binary search for a num that adds to target)
        //                                  (basically doing n binary searches where n is the length of the array)  
        // Space complexity --> O(1)
        for(int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            int candidate = binarySearch(numbers, diff);

            if (candidate != Integer.MIN_VALUE) {
                if (candidate != i) {
                    ind[0] = Math.min(i+1, candidate+1);
                    ind[1] = Math.max(i+1, candidate+1);
                    return ind;
                }        
            }
        }
        
        return null;
    }
    
    private int binarySearch(int[] numbers, int diff) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        
        while (left <= right) {
            if (numbers[mid] == diff) {
                return mid;
            }
            else if (numbers[mid] < diff) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
            
            mid = (right + left) / 2; 
        }
        
        return Integer.MIN_VALUE;
    }
}
