class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int l = words.length;
        int fault = 0;int b = 0;
        for (String str : words) {
            for (int i = 0; i < str.length();i++) {
                char j = str.charAt(i);
                if(allowed.indexOf(j) == -1)
                {
                    fault ++;
                    break;
                }
        }
        }
           return l - fault;     
            }
        }