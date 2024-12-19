class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        TreeSet<Integer> ts = new TreeSet<>();
        int n = arr.length;
       for (int i = 1; ; i++) { 
            if (Arrays.binarySearch(arr, i) < 0) {
                ts.add(i); 
            }
            if (ts.size() == k) {
                break;
            }
        }
        return ts.last();
    }
}
