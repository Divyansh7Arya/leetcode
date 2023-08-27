class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = 1;
         int y = n;
        // for(int i = 1;i < nums.length;i++) {
        //     if(i % 2 == 0) {
        //         nums[i] = nums[x++];
        //     }
        //     else {
        //         nums[i] = nums[y++];
        //     }
        // }
        // return nums;
        int a[] = new int[nums.length];
        a[0] = nums[0];
        for(int i = 1;i < nums.length;i++) {
            if(i % 2 == 0) {
                a[i] = nums[x++];
            }
            else {
                a[i] = nums[y++];
            }
        }
        return a;

    }
}