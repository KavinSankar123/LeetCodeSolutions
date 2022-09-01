class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int i: piles) 
            right = Math.max(right, i);
        
        while(left < right) {
            int mid = (left + right) / 2;
            int hours = 0;
            for(int bananas: piles) 
                hours += Math.ceil((double) bananas / mid);
        
           if(hours <= h)
                right = mid;
            else   
                left = mid + 1;
        }
        
        return right;
    }
}
