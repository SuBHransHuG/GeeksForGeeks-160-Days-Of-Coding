class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int l=0,r=arr.length-1,count=0;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum == target){
               int ele1 = arr[l],ele2=arr[r],c1 =0,c2=0;
               while(l<=r && arr[l] == ele1){
                   l++;
                   c1++;
               }
               while(l<=r && arr[r] == ele2){
                   r--;
                   c2++;
               }
               if(ele1 == ele2)
               count+=(c1*(c1-1))/2;
               else
               count+=(c1*c2);
            }
            else if(sum>target) r--;
            else l++;
        }
        return count;
    }
}
