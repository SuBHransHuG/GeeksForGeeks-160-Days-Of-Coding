class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int n = arr.length;
        Arrays.sort(arr);
        int second =-1;
        for(int i = n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
            second = arr[i];
            break;
            }
        }
        return second;
    }
}