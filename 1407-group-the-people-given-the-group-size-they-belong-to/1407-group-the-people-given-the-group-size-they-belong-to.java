class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        // brute force
        // gs ke upar iterate krenge, jo value hogi usko us size ke list me add krdenge and value ko 0 krdenge taki vo reconsider na ho
        List<List<Integer>> ans = new ArrayList();
        int l = groupSizes.length;     
        for(int i = 0; i < l;i++) {
            if(groupSizes[i] != 0) {
                int size = groupSizes[i];
                List <Integer> temp = new ArrayList();
                // for loop tab tak hi chalega jab tak temp me capacity hogi
                for(int j = 0; j < l && temp.size() < size;j++) {
                    if(groupSizes[j] == size) {
                        temp.add(j);
                        groupSizes[j] = 0;
                    }
                }
                if(temp.size() > 0) ans.add(temp);
            }
        }
        return ans;
    }
}