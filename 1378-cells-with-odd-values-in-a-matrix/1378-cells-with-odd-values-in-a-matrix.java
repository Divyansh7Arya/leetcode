 class Solution {
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
public int oddCells(int n, int m, int[][] indices) {
        int[] rows = new int[n]; //array to hold increments in rows
        int[] columns = new int[m]; //array to hold increments in columns
        
        for(int i = 0; i < indices.length; i++){
            rows[indices[i][0]] += 1;   //increment the indices of rows array based on "indices" array
            columns[indices[i][1]] += 1; //increment the indices of columns array based on "indices" array
        }
        
        int odds = 0;
        for(int i = 0; i < rows.length; i++){
            for(int j = 0; j < columns.length; j++){
                if((rows[i] + columns[j]) % 2 != 0){ //adding rows[i] and columns[j] will give the value in final array. check whether it is odd or even
                    odds += 1; 
                }
            }
        }
        return odds;
    }
 }