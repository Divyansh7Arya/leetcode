class Solution {
    public int[] runningSum(int[] nums) {
        //int sum = 0;
        //int l = nums.length;
        //int arr[] = new int[nums.length];
        for(int i = 1;i < nums.length;i++) {
            //sum += nums[i];
           // arr[i] = sum;
           // BETTER APPROACH
           nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}