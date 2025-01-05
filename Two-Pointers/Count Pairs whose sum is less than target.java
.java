class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        Arrays.sort(arr);
        int l =0,r=arr.length-1,res=0;
        while(l<r)
        {
            if(arr[l]+arr[r]<target){
                res+=(r-l++);
                
            }else{
                r--;
            }
            
        }
        return res;
    }
}