class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        // Arrays.sort(arr);
         int n = arr.length;
        int l = 0;
        int h = n - 1;
        int mid = 0, temp = 0;

        while (mid <= h) {
            if (arr[mid] == 0) {
                swap(arr, mid, l);
                l++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                swap(arr, mid, h);
                h--;
            }
        }
    }
    
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
