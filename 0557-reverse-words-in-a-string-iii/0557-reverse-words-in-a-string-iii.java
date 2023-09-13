class Solution {
    public String reverseWords(String s) {
        String x[] = s.split(" ",9999);
        String temp = "";
        for(String element : x) {
          StringBuilder m = new StringBuilder(element);
          m = m.reverse();
          element = m.toString();
          temp += element + " ";
        }
        return temp.strip();
    }
    
}