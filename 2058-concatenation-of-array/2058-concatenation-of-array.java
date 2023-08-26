class Solution {
    public int[] getConcatenation(int[] nums) {
    //     //int l = nums.length;
    //     int arr[] = new int[2* nums.length];
    //     for(int i = 0;i < nums.length;i++) {
    //    //     arr[i] = nums[i];
    //      //   arr[i+l] = nums[i];
    //      // BETTER APPROACH
    //      arr[i] = arr[i + nums.length] = nums[i];
    //     }
    //     return arr;
    int[] ans = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = ans[i + nums.length] = nums[i];
        }
        
        return ans;
    }
}