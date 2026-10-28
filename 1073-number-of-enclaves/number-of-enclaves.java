class Solution {
    private static final int[][] DIRS = { {-1, 0}, {1, 0}, {0, -1}, {0, 1} };

    private void dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 0; // mark as visited by sinking it
        for (int[] d : DIRS) {
            dfs(grid, r + d[0], c + d[1]);
        }
    }

    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        // Remove all land connected to the border
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n - 1);
        }
        for (int j = 0; j < n; j++) {
            dfs(grid, 0, j);
            dfs(grid, m - 1, j);
        }

        // Whatever land remains is enclosed
        int count = 0;
        for (int[] row : grid)
            for (int cell : row)
                count += cell;
        return count;
    }
}