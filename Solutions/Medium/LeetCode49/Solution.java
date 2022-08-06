class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagrams = new ArrayList<>();
        
        if(strs.length == 0)
            return anagrams;
        
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s: strs) {
            char[] hash = new char[26];
            
            for(char c: s.toCharArray()) 
                hash[c - 'a']++;
            
            String key = new String(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        
        anagrams.addAll(map.values());
        return anagrams;    
    }
    
    // O(m * n) where m is the length of strs and n is the avg length of each string in strs
}
