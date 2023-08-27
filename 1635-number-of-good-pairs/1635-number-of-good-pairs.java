class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodpairs = 0;
       // int temp [] = new int [nums.length];
       // for(int i = 0;i < nums.length;i++){
       //     temp[i] = nums[i];
       // }
        for(int i = 0;i < nums.length;i++){
            for (int j = i+1;j < nums.length;j++){
                if(nums[i] == nums[j]) {
                    goodpairs++;
                }
            }
        }
        return goodpairs;
    }
}