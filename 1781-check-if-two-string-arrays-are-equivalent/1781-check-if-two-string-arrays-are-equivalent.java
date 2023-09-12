class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // String x = "";
        // String y = "";
        // for(int i = 0; i < Math.max(word1.length,word2.length);i++) {
        //     if(i <= word1.length - 1) {
        //                     x += word1[i];
        //     }
        //     if(i <= word2.length - 1) {
        //                      y += word2[i];
        //     }
        // }
        // return x.equals(y);
        // Above code is slow
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        for(int i = 0; i < Math.max(word1.length,word2.length);i++) {
            if(i <= word1.length - 1) {
                                        x.append(word1[i]);
            }
            if(i <= word2.length - 1) {
                                    y.append(word2[i]);
            }
        }
        return x.toString().equals(y.toString());
    }
}