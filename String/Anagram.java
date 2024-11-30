class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]== arr1[i])
            count++;
        }
        if(count == s1.length())
        return true;
        
        // Your code here
        return false;
    }
}
