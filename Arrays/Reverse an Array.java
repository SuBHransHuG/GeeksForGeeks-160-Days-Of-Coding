class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int j =0;
        for(int i = n-1; i>=0;i--){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j++] = temp;
          if(j>=i){
              break;
          }
        }
    }
}
