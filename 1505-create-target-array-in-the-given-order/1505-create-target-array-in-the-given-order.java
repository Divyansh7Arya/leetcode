class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int target [] = new int [nums.length];
        int i , j ;
        for (var x : target) {
            x = -1;
        }
        for(i = 0; i < nums.length;i++) {
            if(target[index[i]] == -1) {
                target[index[i]] = nums[i];
            }
            else {
                //shifting array 
                for(j = nums.length - 1;j > index[i];j--) {
                    target[j] = target[j-1] ;
                }
                // putting value at correct position
                target[index[i]] = nums[i];
            }
        }
        return target;
        }
    }
