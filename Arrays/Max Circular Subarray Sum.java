class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
         int maxSum = kadane(arr);
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
            arr[i] = -arr[i];
        }
        int circularSum = totalSum + kadane(arr);
        return circularSum == 0 ? maxSum : Math.max(maxSum, circularSum);
    }

    private static int kadane(int[] arr) {
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    }
