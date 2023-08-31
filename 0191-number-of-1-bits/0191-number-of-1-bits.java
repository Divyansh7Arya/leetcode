public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // SETBITS
        int cnt = 0;
        while(n != 0) {
            cnt ++;
            n = n & (n - 1);
            
        }
        return cnt;
    }
}