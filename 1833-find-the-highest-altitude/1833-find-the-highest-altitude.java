class Solution {
    public int largestAltitude(int[] gain) {
        int mas = 0;
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