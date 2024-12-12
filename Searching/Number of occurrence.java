class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i : arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getKey() == target){
                return entry.getValue();
            }
        }
        return 0;
    }
}
