class Solution {
    public boolean isMonotonic(int[] nums) {
        int ele = nums[0];
        int flag = 0;
        int i = 0;
        for( i = 1; i < nums.length;i++) {
            if(nums[i] != ele) {
                ele = nums[i];
                flag++;
                break;
            }
        }
        if(flag == 0) return true;
        if(i == nums.length - 1) return true;
        // stream me get krke 
        if(ele > nums[0]) {
            System.out.println(i + "" + ele);
            for(int j = i + 1; j < nums.length;j++) {
                if(nums[j] < nums[j - 1]) return false;
            }
        }
        else {
            for(int j = i + 1; j < nums.length;j++) {
                if(nums[j] > nums[j - 1]) return false;
            }
        }
        return true;
    }
}