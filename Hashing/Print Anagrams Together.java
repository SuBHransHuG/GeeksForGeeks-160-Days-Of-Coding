class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String,ArrayList<String>> hm = new LinkedHashMap<>();
        for(String w : arr){
            char[] ar = w.toCharArray();
            Arrays.sort(ar);
            String sorted = new String(ar);
            hm.putIfAbsent(sorted,new ArrayList<>());
            hm.get(sorted).add(w);
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for(ArrayList<String> al : hm.values()){
            res.add(al);
        }
        res.sort((a,b)->a.get(0).compareTo(b.get(0)));
        return res;
    }
}
