class Solution {
    public boolean isMonotonic(int[] nums) {
        // int ele = nums[0];
        // int flag = 0;
        // int i = 0;
        // for( i = 1; i < nums.length;i++) {
        //     if(nums[i] != ele) {
        //         ele = nums[i];
        //         flag++;
        //         break;
        //     }
        // }
        // if(flag == 0) return true;
        // if(i == nums.length - 1) return true;
        // upar vala sab kaam kiya pata lagane ke liye ki arr inc hai ya decreasing 
        // is se acha compare kro arr 1st element to last
        if(nums[0] < nums[nums.length - 1]) {
            for(int j = 1; j < nums.length;j++) {
                if(nums[j] < nums[j - 1]) return false;
            }
        }
        else {
            for(int j =  1; j < nums.length;j++) {
                if(nums[j] > nums[j - 1]) return false;
            }
        }
        return true;
    }
}