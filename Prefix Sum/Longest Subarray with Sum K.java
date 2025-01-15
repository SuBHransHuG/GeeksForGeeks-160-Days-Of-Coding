class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int max = 0;
        int sum =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,-1);
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(hm.containsKey(sum-k)){
                max = Math.max(max,i-hm.get(sum-k));
            }
            hm.putIfAbsent(sum,i);
        }
        return max;
    }
}
