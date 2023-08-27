class Solution {
    public int largestAltitude(int[] gain) {
        int ans [] = new int [gain.length + 1];
        int mas = 0;
        ans[0] = 0;
        for(int i = 0; i < gain.length;i++) {
            ans[i+1] = ans[i] + gain[i];
        }
        for (int element : ans) {
            mas = Math.max(mas,element);   
        }
        if (mas < 0) {
            return 0;
        }
        return mas;
        
        }
    
}