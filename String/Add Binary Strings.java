class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder result = new StringBuilder();
        int indexA = s1.length()-1;
        int indexB = s2.length()-1;
        int c = 0;
        while(indexA>=0 || indexB>=0 || c>0){
             if (indexA >= 0) {
                c += s1.charAt(indexA) - '0';
                indexA--;
            }
             if (indexB >= 0) {
                c += s2.charAt(indexB) - '0';
                indexB--; 
            }
            result.append(c%2);
            c/=2;
        }
        
        String s = result.reverse().toString();
        int one = s.indexOf('1');
        return (one == -1) ? "0": s.substring(one);
    }
}
