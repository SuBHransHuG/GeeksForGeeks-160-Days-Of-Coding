class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int maxProduct = arr[0], minProduct = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(arr[i], Math.max(maxProduct * arr[i], minProduct * arr[i]));
            minProduct = Math.min(arr[i], Math.min(temp * arr[i], minProduct * arr[i]));
            result = Math.max(result, maxProduct);
        }
        return result;
    }
}
