class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) {
            return false;
        }
        // ArrayList<Character>arr = new ArrayList<>(26);
        // for (char i = 'a'; i <= 'z';i++) {
        //     arr.add(i);
        // }
        // for (int i = 0;i < sentence.length();i++) {
        //     if(arr.contains(sentence.charAt(i))) {
        //         arr.remove(Character.valueOf(sentence.charAt(i)));
        //     }
        // }
        // return (arr.isEmpty());
        for (char i = 'a'; i <= 'z';i++) {
            if(sentence.indexOf(i) == -1) {
                return false;
            }
        }
        return true;
        }
}