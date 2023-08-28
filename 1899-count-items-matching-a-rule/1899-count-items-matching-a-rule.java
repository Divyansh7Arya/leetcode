class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        int x;
        if (ruleKey.contains("type")) {
            x = 0;
        }
        else if (ruleKey.contains("color")) {
            x = 1;
        } else {
            x = 2;
        }
        for(int i = 0; i < items.size(); i++) {
        //   for(int j = 0; j < items.size(); j++) {
                if(items.get(i).get(x).equals(ruleValue)) {
                    cnt ++;
                }
         //   }
        }
        return cnt;
    }
}