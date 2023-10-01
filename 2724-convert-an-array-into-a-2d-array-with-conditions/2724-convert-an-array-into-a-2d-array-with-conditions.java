class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        List<List<Integer>> ans = new ArrayList();
        // frequency distribution
        int maxv = 1;
        for(int i = 0; i < nums.length;i++) {
            if(map.containsKey(nums[i])) {
                int possible = map.get(nums[i]) + 1;
                if(possible > maxv) maxv = possible;
                map.put(nums[i],possible);
            }
            else map.put(nums[i],1);
        }
        int n = map.size();
        for(int i = 0; i < maxv;i++) {
            int flag = 0;
            List<Integer> temp = new ArrayList();
            for(int key : map.keySet()) {
                flag++;
                int val = map.get(key);
                if(val != 0) {
                    temp.add(key);
                    map.put(key,map.get(key) - 1);
                }
                if(flag == n) {
                    if(temp.size() > 0)
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}