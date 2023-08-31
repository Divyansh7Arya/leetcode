class Solution {
    public int hammingDistance(int x, int y) {
        int cnt = 0;
        while(Math.max(x,y) != 0) {
            int a = y & 1;
            int b = x & 1;
            int z = a^b;
            if (z == 1) {
                cnt++;
            }
            x >>= 1;
            y >>= 1;
        }
        return cnt;
    }
}