package array;

import java.util.HashMap;
import java.util.Map;

public class Sudoku {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9]; // 存储每一行的的元素的位或运算值
        int[] columns = new int[9];  // 存储每一列的的元素的位或运算值
        int[] squares = new int[9]; // 存储每一个3*3的的元素的位或运算
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                // 将1向左移动board[i][j]位，然后这个位置上的1就代表board[i][j]
                int value = 1 << (board[i][j] - '0');
                // 将value和这一行上的位或运算值进行位与运算，因为位与的特征，只有对位都是1，才是1，否则为0.
                // 所以如果结果>0说明对位都是1，即这一行有相同的元素
                if ((value & rows[i]) > 0) {
                    return false;
                }else if((value &  columns[j]) > 0) {
                    return false;
                } else if ((value & squares[3 * i/3 + j/3]) > 0){
                    // 3 * i/3 + j/3.表示每一个3*3.可以看出这里按squares的顺序是从上到下，从做到右
                        return false;
                }

                // 将这个运算与当前行的位或值再次位或.位或都为0，才是0
                rows[i] |= board[i][j];
                columns[j] |= board[i][j];
                squares[3*i/3+j/3] |= board[i][j];
            }
        }

        return  true;
    }
}