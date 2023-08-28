// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int cnt = 0;
//         int x = 0;
//         if (ruleKey.equals("color")) {
//             x = 1;
//         } else if (ruleKey.equals("name")) {
//             x = 2;
//         }
//         for(int i = 0; i < items.size(); i++) {
//                 if(items.get(i).get(x).equals(ruleValue)) {
//                     cnt ++;
//                 }
//         }
//         return cnt;
//     }
// }
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;
        
    }
}