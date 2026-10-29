class Solution {
    public static final int[][] dir = { {0, 1}, {0, -1}, {-1, 0}, {1, 0} };

    public void solve(char[][] board) {
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                board[i][0] = 's';
                dfs(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                board[i][n - 1] = 's';
                dfs(board, i, n - 1);
            }
        }

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                board[0][j] = 's';
                dfs(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                board[m - 1][j] = 's';
                dfs(board, m - 1, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == 's') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] mat, int r, int c) {
        for (int[] d : dir) {
            int rnew = r + d[0];
            int cnew = c + d[1];
            if (rnew >= 0 && cnew >= 0 && rnew < mat.length && cnew < mat[0].length
                    && mat[rnew][cnew] == 'O') {
                mat[rnew][cnew] = 's';
                dfs(mat, rnew, cnew);
            }
        }
    }
}