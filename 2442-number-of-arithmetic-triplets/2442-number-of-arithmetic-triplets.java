class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        //JIN QUESTIONS ME ARRAY ME CHEDCHAD KRNI HO YA COMPARISONS KRNE HO USME HASH MAP YA SETS USE KRTE HAIN
        // approach 1 using hash map
        HashMap <Integer,Integer> map = new HashMap();
        int cnt = 0;
        for(int i = 0;i < nums.length;i++) {
            if(map.containsValue(nums[i] - diff) && map.containsValue(nums[i] - 2*diff)) cnt++;
            map.put(i,nums[i]);
        }
        return cnt;




        // array se bhi try krna
    }
}