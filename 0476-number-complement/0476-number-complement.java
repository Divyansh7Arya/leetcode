class Solution {
    public int findComplement(int num) {
        int temp = num, x = 0;
        while(temp != 0) {
            temp >>= 1;
            x <<= 1;
            x |= 1;
        }
        return num ^ x;
    }
}