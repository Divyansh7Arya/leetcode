class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        List<List<Integer>> ans = new ArrayList();
        // frequency distribution
        for(int i = 0; i < nums.length;i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else map.put(nums[i],1);
        }
        int n = map.size();
        int maxv = 0;
        for(Integer x : map.values()) {
            if(x > maxv) 
            maxv = x;
        }
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