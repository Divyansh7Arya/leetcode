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
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int [n];
        int col[] = new int [m];
        for(int x[] : indices)
        {
            row[x[0]]++;
            col[x[1]]++;
        }    
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
            {
                if((row[i]+col[j])%2!=0)
                    count++;
            }        
        return count;
    }
}