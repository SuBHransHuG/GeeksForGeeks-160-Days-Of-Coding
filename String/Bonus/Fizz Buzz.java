class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> al = new ArrayList<String>();
        for(int i =1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                al.add("FizzBuzz");
            }
            else if(i%3 == 0){
                al.add("Fizz");
            }
            else if(i%5==0){
                al.add("Buzz");
            }
            else{
                al.add(Integer.toString(i));
            }
        }
        return al;
    }
}
