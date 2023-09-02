class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int fault = 0;
        for (String str : words) {
            
            for (int i = 0; i < str.length();i++) {
                //char j = str.charAt(i);
                if(allowed.indexOf(str.charAt(i)) == -1)
                {
                    fault ++;
                    break;
                }
        }
        }
           return words.length - fault;     
            }
        }