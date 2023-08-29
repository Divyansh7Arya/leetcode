// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
//         int arr[][] = new int [m][n];
//         int flag ;
//         int odd = 0;
//         for (int[] row : indices) {
//             flag = 0;
//             for(int element : row) {
//                 flag++;
//                 for(int i = 0;i < m;i++ ) {
//                     for (int j = 0 ; j < n;j++) {
//                         if (flag == 1 && i == element){
//                             arr[i][j]++;
//                         }
//                         else if (flag == 2 && j == element) {
//                             arr[i][j]++;
//                         }
//                     }
//                 }
//             }
//         }
//         for(int[] row : arr) {
//             for (int ele : row ) {
//                 if (ele % 2 != 0) {
//                     odd++;
//                 }
//             }
//         }
//         return odd;
//     }
// }
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            //row is constant
            for (int j = 0; j <n; j++) {
                ans[indices[i][0]][j]++;
            }

            //column is constant
            for (int j = 0; j < m; j++) {
                ans[j][indices[i][1]]++;
            }
        }
        
        // Counting ODD numbers in the final Matrix
        int count = 0;
        for (int i= 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}