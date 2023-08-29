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
        int[] rows = new int[m];
        int[] columns = new int[n];

        for (int i = 0; i < indices.length; i++) {
            rows[indices[i][0]]++;
            columns[indices[i][1]]++;
        }

        int rowOdds = 0, columnOdds = 0;
        for (int r : rows) {
            if (r%2 != 0) rowOdds++;
        }
        for (int c : columns) {
            if (c%2 != 0) columnOdds++;
        }

        return rowOdds*(n - columnOdds) + columnOdds*(m - rowOdds);
    }
}