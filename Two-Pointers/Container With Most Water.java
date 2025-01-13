class Solution {

    public int maxWater(int arr[]) {
        // Code Here
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        int left = 0;
        int right = n-1;
        int res = 0;
        while(left<right){
            int w = Math.min(arr[left],arr[right])*(right-left);
            res = Math.max(w,res);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
