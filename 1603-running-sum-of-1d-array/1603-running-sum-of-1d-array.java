class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int l = nums.length;
        int arr[] = new int[l];
        for(int i = 0;i < l;i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}