class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int l=0,curr=0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int r =0;r<arr.length;r++){
            curr+=arr[r];
            while(curr>target && l<=r){
                curr-=arr[l];
                l++;
            }
            if(curr==target){
                al.add(l+1);
                al.add(r+1);
                return al;
            }
        }
        al.add(-1);
        return al;
    }
}
