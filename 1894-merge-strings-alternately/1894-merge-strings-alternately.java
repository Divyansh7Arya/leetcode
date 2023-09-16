class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = word1.length() - 1;
        int j = word2.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            if(i >= 0) {
                sb.append(word1.charAt(word1.length() - 1 - i));
            }
            if(j >= 0) {
                sb.append(word2.charAt(word2.length() - 1 - j));
            }
            i--;
            j--;
        }
        return sb.toString();
    }
}