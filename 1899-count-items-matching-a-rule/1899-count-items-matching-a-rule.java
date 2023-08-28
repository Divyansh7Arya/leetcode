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
        for(List<String> row : items) {
                if(row.get(x).equals(ruleValue)) {
                    cnt ++;
                }
        }
        return cnt;
    }
}