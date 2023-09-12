class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x = "";
        String y = "";
        for(int i = 0; i < word1.length;i++) {
            x += word1[i];
        }
        for(String m : word2) {
                        y += m;
        }
        return x.equals(y);
    }
}