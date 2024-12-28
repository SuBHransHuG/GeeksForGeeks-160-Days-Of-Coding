class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]<target){
                count++;
            }
            if(arr[i]>target || arr[i] == target){
                return i;
            }
        }
        if(count == n){
            return n;
        }
        return 0;
    }
}
