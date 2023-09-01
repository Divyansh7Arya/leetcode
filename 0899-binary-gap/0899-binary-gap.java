class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int dist = 0;
        for (int i = 0; i < s.length();i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && s.charAt(i) == '1') {
                    dist = Math.max(dist,j - i);
                    break;
                }
            }
        }
        return dist;
    }
}