class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 1)
            return true;
        
        s = s.toLowerCase();

        int leftInd = 0;
        int rightInd = s.length() - 1;
        
        while(leftInd <= rightInd) {
            
            if(!Character.isLetterOrDigit(s.charAt(leftInd))) {
                leftInd++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(rightInd))) {
                rightInd--;
                continue;
            }
            
            if (s.charAt(leftInd) != s.charAt(rightInd)) {
                return false;
            }
            leftInd++;
            rightInd--;
        }
              
        return true;
    }
}
