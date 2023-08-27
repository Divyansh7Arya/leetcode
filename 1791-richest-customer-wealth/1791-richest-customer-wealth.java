class Solution {
    public int maximumWealth(int[][] accounts) {
        // int max = 0,sum = 0;
        // int x = accounts.length;
        // if(x == 1) {
        //     for(int i = 0; i < accounts[0].length;i++) {
        //         max += accounts[0][i];
        //     }
        // }
        // else {
        // for(int i = 0; i < x; i++ ) {
        //     if(sum > max) {
        //         max = sum;
        //     }
        //     sum = 0;
        //     for(int j = 0; j < accounts[0].length; j++) {
        //         sum += accounts[i][j];
        //     }
        // }
        // }
        // return max;
        var max = 0;
        for(var customer : accounts) {
            var sum = 0;
            for(var bank : customer) {
                sum += bank;
            }
        max = Math.max(max,sum);
        }
        return max;
    }
}