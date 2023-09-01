class Solution {
    public boolean hasAlternatingBits(int n) {
        int match = 0;
        int cnt = 0;
        while (n > 0) {
            int last = n & 1;
            n >>= 1;
            if (cnt > 0) {
                if (match == last) {
                    return false;
                }
            }
            cnt++;
             match = last;
        }
        return true;
    }
}