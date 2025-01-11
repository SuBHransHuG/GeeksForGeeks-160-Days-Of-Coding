class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int st =0;
        int max =0 ; 
        HashSet<Character> hs = new HashSet<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            while(hs.contains(c)){
                hs.remove(s.charAt(st));
                st++;
            }
            hs.add(c);
            max = Math.max(max,i-st+1);
        }
        return max;
    }
}
