class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // working
        // eg 8 1 2 2 3
        // we will sort it and put it in new arr 
        // new = 1 2 2 3 8
        // then we will map the sorted array to map(we will start from last member of arr)
        // basically we need index of 8 in sorted array to tell how many numbers it is larger than
        // but there is no indexof in aray
        // so we store it in hashmap where the value is index of 8
        HashMap<Integer,Integer> map = new HashMap();
        int[] arr = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        for(int i = nums.length - 1;i >= 0; i --) map.put(nums[i],i);
        for(int i = 0; i < nums.length;i++) arr[i] = map.get(arr[i]);
        return arr;
    }
}