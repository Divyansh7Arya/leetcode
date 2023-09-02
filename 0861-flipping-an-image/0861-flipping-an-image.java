class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        if (image == null || image.length == 0 || image[0].length == 0) {
            return image;
        }
        int start,end; // variables to swap
        int l = image[0].length;
        for(int i = 0;i < l;i++) {
                start = 0;
                end = l-1;
            if (l % 2 != 0) {
                image[i][l / 2] ^= 1;
            }
                // swapping
                while(start < end) {
                image[i][start] = image[i][start] + image[i][end];
                image[i][end] = image[i][start] - image[i][end];
                image[i][start] = image[i][start] - image[i][end];
                image[i][start] ^= 1;
                image[i][end] ^= 1;
                start++;
                end--;
            }
        }
        return image;
    }
}
