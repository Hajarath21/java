import java.util.*;

public class NQueenProblem {
    private int N;
    private int[][] board;

    public NQueenProblem(int N) {
        this.N = N;
        this.board = new int[N][N];
    }

    private boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private boolean solveNQueenUtil(int col) {
        if (col >= N) {
            return true;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 1;

                if (solveNQueenUtil(col + 1)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }

        return false;
    }

    public boolean solveNQueen() {
        if (!solveNQueenUtil(0)) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSolution();
        return true;
    }

    private void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 8;
        NQueenProblem queen = new NQueenProblem(N);
        queen.solveNQueen();
    }
}
