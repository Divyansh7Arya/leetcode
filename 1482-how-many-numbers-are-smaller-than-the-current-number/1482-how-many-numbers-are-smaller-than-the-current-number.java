class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int cnt = 0;
        int temp[] = new int [nums.length];
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] > nums[j]) {
                    cnt++;
                }
            }
            for(int k = i - 1;k >=0;k--){
                    if(nums[i] > nums[k]) {
                        cnt ++;
                    }
                }
            temp[i] = cnt;
            cnt = 0;
        }
        return temp;
    }
}