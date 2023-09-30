class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Integer> map = new HashMap();
        HashMap<Integer,Character> alpha = new HashMap();
        int cnt = 1;
        int temp = 97;
        for(char x : key.toCharArray()) {
            if(x != ' ' && map.containsKey(x) == false) {
                map.put(x,cnt++);
            }
        }
        for(int i = 1; i <= 26;i++ ) {
            alpha.put(i,(char)temp);
            temp++;
        }
        StringBuilder s = new StringBuilder();
        for(char x : message.toCharArray()) {
            if(x == ' ') s.append(" ");
            else {
            int num = map.get(x);
            s.append(alpha.get(num));
            }
        }
        return s.toString();
    }
}