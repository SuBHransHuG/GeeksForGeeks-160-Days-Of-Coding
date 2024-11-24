class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int sum = arr[0];
        int maxi =arr[0];
        for(int i =1;i<n;i++){
            maxi= Math.max(maxi+arr[i],arr[i]);
            sum = Math.max(sum,maxi);
        }
        return sum;
    }
}
