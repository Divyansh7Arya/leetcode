public class Solution {
    public int reverseBits(int n) {
        int jagah = 0;
        for (int i = 0;i < 32;i++) {
            jagah <<= 1;
            jagah += n & 1;
            n >>= 1;
        }
        return jagah;
    }
}