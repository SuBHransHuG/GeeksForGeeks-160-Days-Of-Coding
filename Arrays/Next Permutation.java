class Solution {
    void nextPermutation(int[] arr) {
        // code here
          if (arr == null || arr.length <= 1) return;

        int n = arr.length;
        int k = n - 2;
        while (k >= 0 && arr[k] >= arr[k + 1]) {
            k--;
        }

        if (k >= 0) {
            int l = n - 1;
            while (arr[l] <= arr[k]) {
                l--;
            }
            swap(arr, k, l);
        }

        reverse(arr, k + 1, n - 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
