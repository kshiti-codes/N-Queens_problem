public class NQueens {
    public static void main(String[] args) {
        int n = 8; // Change this value for different board sizes
        solveNQueens(n);
    }

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];
        if (solveNQueensUtil(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }

    private static boolean solveNQueensUtil(int[][] board, int row) {
        int n = board.length;
        if (row >= n) {
            return true;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                if (solveNQueensUtil(board, row + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false; // No valid position found
    }

    private static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static void printBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
