class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> al = new ArrayList<Integer>();
        int n = nums.length;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()>(n/3)){
                al.add(entry.getKey());
            }
        }
        return al;
    }
}
