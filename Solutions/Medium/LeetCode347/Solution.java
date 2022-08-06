class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1)
            return nums;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for(int i: nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
            else {
                map.put(i, map.get(i) + 1);
            }
        }
        
        // Max PQ
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            pq.add(entry);
        }
        
        int[] output = new int[k];
        for(int i = 0; i < k; i++) {
            output[i] = pq.poll().getKey();
        }
        
        return output;
    }
}
