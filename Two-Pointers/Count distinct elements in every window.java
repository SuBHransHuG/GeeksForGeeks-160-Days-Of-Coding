class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<=n-k;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j =i;j<(i+k);j++){
                hs.add(arr[j]);
                }
                al.add(hs.size());
            }
            
        return al;
    }
}
