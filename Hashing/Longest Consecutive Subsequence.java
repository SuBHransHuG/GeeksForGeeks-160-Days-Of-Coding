class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
       if(arr == null || arr.length == 0)
       return 0;
       
       HashSet<Integer> hs = new HashSet<>();
       for(int i : arr){
           hs.add(i);
       }
       int st = 0;
       for(int i : hs){
           if(!hs.contains(i-1)){
               int curr = i;
               int currSt = 1;
               while(hs.contains(curr+1)){
                   curr+=1;
                   currSt+=1;
               }
               st = Math.max(st,currSt);
           }
       }
       return st;
    }
}
