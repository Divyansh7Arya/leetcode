class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder a = new StringBuilder(s.substring(0,s.length() / 2));
        StringBuilder b = new StringBuilder(s.substring(s.length() / 2,s.length()));
        System.out.println(a);
        System.out.println(b);
        int acnt = 0;
        int bcnt = 0;
        for(int i = 0;i < s.length() / 2; i ++) {
            if(Character.toLowerCase(a.charAt(i)) == 'a' || Character.toLowerCase(a.charAt(i)) == 'e' || Character.toLowerCase(a.charAt(i)) == 'i' || Character.toLowerCase(a.charAt(i)) == 'o' || Character.toLowerCase(a.charAt(i)) == 'u' ) {
                acnt++;
            }
            if(Character.toLowerCase(b.charAt(i)) == 'a' || Character.toLowerCase(b.charAt(i)) == 'e' || Character.toLowerCase(b.charAt(i)) == 'i' || Character.toLowerCase(b.charAt(i)) == 'o' || Character.toLowerCase(b.charAt(i)) == 'u' ) {
                acnt--;
            }
        }
        return acnt == 0;
    }
}