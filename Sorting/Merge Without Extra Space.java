class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
         int n = a.length;
        int m = b.length;
        int[] arr = new int[n+m];
System.arraycopy(a, 0, arr, 0, n);
        System.arraycopy(b, 0, arr, n, m);
        int l= n+m;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        int j=0;
        for(int i=n ;i<l;i++){
            b[j] = arr[i];
            j++;
        }

    }
}
