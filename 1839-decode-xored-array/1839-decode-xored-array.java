// class Solution {
//     public int[] decode(int[] encoded, int first) {
//         int [] arr = new int [encoded.length + 1];
//         arr[0] = first;
//         //for(int i = 1; i < arr.length; i++) {
//             //arr[i] = arr[i - 1] ^ encoded[i - 1];
// // is approach me hame 2 baar peeche {[i-1]} dekhna pad rha hai, this increases time taken
// // so we do approach jisme sirf ek baar dekhna pade
//         for(int i = 0; i < encoded.length; i ++) {
//             arr[i + 1] = arr[i] ^ encoded[i];
//         }
//         return arr;
//     }
// }
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] ans = new int[encoded.length + 1];
        ans[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            ans[i + 1] = ans[i] ^ encoded[i];
        }
        return ans;
    }
}