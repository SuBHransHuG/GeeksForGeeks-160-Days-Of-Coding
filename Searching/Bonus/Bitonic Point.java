class Solution {
    public int findMaximum(int[] arr) {
        // code here
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
