class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        TreeSet<Integer> ts = new TreeSet<Integer>();
        for(int i : arr){
            ts.add(i);
        }
        int first = ts.first();
        return first;
    }
}
