package array;

public class RotateImage {
    public void rotate(int[][] matrix) {
         int l = matrix.length;
        // 1. 先旋转每一行
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l/2; j++) {
                // exChange
                int temp = matrix[i][l-1-j];
                matrix[i][l-1-j] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        // 2. 按照从右上角到左上角画斜线对折
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[l - 1 - j][l - 1 -i];
                matrix[l - 1 - j][l - 1 -i] = temp;
            }
        }
    }
}
