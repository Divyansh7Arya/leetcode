class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String x = "";
        String y = "";
        for(int i = 0; i < Math.max(word1.length,word2.length);i++) {
            if(i <= word1.length - 1) {
                            x += word1[i];
            }
            if(i <= word2.length - 1) {
                             y += word2[i];
            }
        }
        // for(String m : word2) {
        //                 y += m;
        // }
        return x.equals(y);
    }
}