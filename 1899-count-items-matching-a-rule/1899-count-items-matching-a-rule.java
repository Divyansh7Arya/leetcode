class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        int x = 0;
        if (ruleKey.equals("color")) {
            x = 1;
        } else if (ruleKey.equals("name")) {
            x = 2;
        }
        for(int i = 0; i < items.size(); i++) {
                if(items.get(i).get(x).equals(ruleValue)) {
                    cnt ++;
                }
        }
        return cnt;
    }
}