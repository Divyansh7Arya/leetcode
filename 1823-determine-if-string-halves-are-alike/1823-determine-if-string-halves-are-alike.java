class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder a = new StringBuilder(s.substring(0,s.length() / 2));
        StringBuilder b = new StringBuilder(s.substring(s.length() / 2,s.length()));
        System.out.println(a);
        System.out.println(b);
        int acnt = 0;
        int bcnt = 0;
        for(int i = 0;i < s.length() / 2; i ++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I' || a.charAt(i) == 'O' || a.charAt(i) == 'U' ) {
                acnt++;
            }
            if(b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u' || b.charAt(i) == 'A' || b.charAt(i) == 'E' || b.charAt(i) == 'I' || b.charAt(i) == 'O' || b.charAt(i) == 'U' ) {
                bcnt++;
            }
        }
        return acnt == bcnt;
    }
}