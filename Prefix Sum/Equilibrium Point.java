class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int total = 0;
        for(int i : arr){
            total+=i;
        }
        int left =0;
        for(int i =0;i<arr.length;i++){
            int right = total - left - arr[i];
            if(left == right){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
