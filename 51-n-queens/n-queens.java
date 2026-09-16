import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] mainDiag = new boolean[2 * n]; // row - col + n
        boolean[] antiDiag = new boolean[2 * n]; // row + col

        backtrack(0, n, board, result, cols, mainDiag, antiDiag);

        return result;
    }

    private void backtrack(int row, int n, char[][] board,
                           List<List<String>> result,
                           boolean[] cols, boolean[] mainDiag,
                           boolean[] antiDiag) {

        if (row == n) {
            result.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            int mainDiagIdx = row - col + n;
            int antiDiagIdx = row + col;

            if (cols[col] || mainDiag[mainDiagIdx] ||
                antiDiag[antiDiagIdx]) {
                continue;
            }

            board[row][col] = 'Q';
            cols[col] = true;
            mainDiag[mainDiagIdx] = true;
            antiDiag[antiDiagIdx] = true;

            backtrack(row + 1, n, board, result,
                      cols, mainDiag, antiDiag);

            board[row][col] = '.';
            cols[col] = false;
            mainDiag[mainDiagIdx] = false;
            antiDiag[antiDiagIdx] = false;
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> internal = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            internal.add(new String(board[i]));
        }

        return internal;
    }
}