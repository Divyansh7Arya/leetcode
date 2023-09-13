class Solution {
    public boolean halvesAreAlike(String s) {
        String sb = s.toLowerCase();
        String a = (sb.substring(0,sb.length() / 2));
        String b = (sb.substring(sb.length() / 2,sb.length()));
        int acnt = 0;
        int bcnt = 0;
        for(int i = 0;i < s.length() / 2; i ++) {
            if((a.charAt(i)) == 'a' || (a.charAt(i)) == 'e' || (a.charAt(i)) == 'i' || (a.charAt(i)) == 'o' || (a.charAt(i)) == 'u' ) {
                acnt++;
            }
            if((b.charAt(i)) == 'a' || (b.charAt(i)) == 'e' || (b.charAt(i)) == 'i' || (b.charAt(i)) == 'o' || (b.charAt(i)) == 'u' ) {
                acnt--;
            }
        }
        return acnt == 0;
    }
}
// int cnt (String s ) {
//     int arr[] = s.toCharArray();
//     for(int i = 0; i < s.length(); i++) {
//         if(arr[i])
//     }
// }