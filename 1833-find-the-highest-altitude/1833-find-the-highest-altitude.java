class Solution {
    public int largestAltitude(int[] gain) {
        // int ans [] = new int [gain.length + 1];
         int mas = 0;
        // ans[0] = 0;
        for(int i = 1; i < gain.length;i++) {
            gain[i] = gain[i-1] + gain[i];
        }
        for (int element : gain) {
            mas = Math.max(mas,element);   
        }
        if (mas < 0) {
            return 0;
        }
        return mas;
        
        }
    
}