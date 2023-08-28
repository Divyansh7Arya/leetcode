class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int start,end; // variables to swap
        int l = image[0].length;
        for(int i = 0;i < l;i++) {
            //Inverting
             for(int j = 0;j < l;j++) {
                if(image[i][j] == 0) {
                    image[i][j] = 1;
                }
                else {
                    image[i][j] = 0;
                }
             }
             // Inverting done
                start = 0;
                end = l-1;
                // swapping
                while(start < end) {
                image[i][start] = image[i][start] + image[i][end];
                image[i][end] = image[i][start] - image[i][end];
                image[i][start] = image[i][start] - image[i][end];
                start++;
                end--;
            }
        }
        return image;
    }
}