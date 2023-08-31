class Solution {
    public int[] countBits(int n) {
        int ans [] = new int [n + 1] ;
        int cnt = 0;
        for (int i = 1;i < ans.length; i ++ ) {
            int temp = i;
            while (temp != 0) {
                temp &= temp - 1;
                cnt ++;
            }
            ans[i] = cnt;
            cnt = 0;
        }
        return ans;
    }
}