class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] + 1 <= 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
            } 
            else {
                digits[i] += 1;
                return digits;
            }
            
        }
        
        if (digits[digits.length - 1] == 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            
            return arr;
        }
        
        return digits;
    }
}
