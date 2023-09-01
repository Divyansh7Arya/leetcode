class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int [n];
        int unique = 0;
        // a ^ 0 = a
        // a ^ 1 = ~a
        // a ^ a = 0
        for(int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            unique ^= nums[i];
        }
        return unique;
        
    }
}