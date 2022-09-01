class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] > target)
                return false;
            else if(binarySearch(matrix[i], target))
                return true;
        } 
        return false;
    }
    
    private static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            
        }
        return false;
    }
}
