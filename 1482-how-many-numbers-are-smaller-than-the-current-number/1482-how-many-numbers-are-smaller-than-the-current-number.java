class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] a = new int [nums.length];
        int i = 0;
        for(int x : nums) {
            a[i++] = (int)Arrays.stream(nums).filter(w -> w < x).count();
        }
        return a;
    }
}