class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left = 0;
       int totalMax = 0;
        
       HashSet<Character> set = new HashSet<>();
        
       for(int i = 0; i < s.length(); i++) {
           
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }        
           
            set.add(s.charAt(i));
            totalMax = Math.max(totalMax, i - left + 1);  
       }
        
        return totalMax;   
    }
}
