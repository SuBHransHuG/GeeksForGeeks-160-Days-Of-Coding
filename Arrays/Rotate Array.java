class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
       int n = arr.length;

        d = d % n;

        int[] a = new int[d];
        for (int i = 0; i < d; i++) {
            a[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = a[i];
        }
    }
}
