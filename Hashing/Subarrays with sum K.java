class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        int count = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int c = 0;
        int psum = 0;
        hm.put(0,1);
        for(int i:arr){
            psum+=i;
            if(hm.containsKey(psum-k)){
                c+=hm.get(psum-k);
            }
            hm.put(psum,hm.getOrDefault(psum,0)+1);
        }
        return c;
    }
}
