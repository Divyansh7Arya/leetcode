class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        // xor with 1 = a complement
        // xor with 0 = a
        // xor with a = 0
        // so we xor whole array, only single appearing number will be left
        for(int i = 0; i < nums.length;i++) {
            unique ^= nums[i];
        }
        return unique;
    }
}