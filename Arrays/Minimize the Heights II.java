class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
         if (n == 1) return 0;
        Arrays.sort(arr);
        int minDiff = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        if (smallest > largest) {
            int temp = smallest;
            smallest = largest;
            largest = temp;
        }

        for (int i = 0; i < n - 1; i++) {
            int minHeight = Math.min(smallest, arr[i + 1] - k);
            int maxHeight = Math.max(largest, arr[i] + k);

            if (minHeight >= 0) {
                minDiff = Math.min(minDiff, maxHeight - minHeight);
            }
        }

        return minDiff;
    }
}
