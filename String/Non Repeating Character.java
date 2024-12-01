class Solution {
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        char[] arr = s.toCharArray();
        
         LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
         for(char ch:arr){
             lhm.put(ch,lhm.getOrDefault(ch,0)+1);
         }
         for (Map.Entry<Character,Integer> map : lhm.entrySet()) {
         
             if(map.getValue()==1){
                 return map.getKey();
             }
         }
         return '$';
         
    }
}
