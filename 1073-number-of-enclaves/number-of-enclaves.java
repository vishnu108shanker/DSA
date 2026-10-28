class Solution {
    static int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    private int supercount = 0;

    private void dfs(int[][] grid, int row, int col, boolean[][] vis) {
        for (int[] d : dirs) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
                if (!vis[newRow][newCol] && ((grid[row][col] == 1 && grid[newRow][newCol] == 1) || newRow == 0
                        || newCol == 0 || newRow == grid.length-1 || newCol == grid[0].length-1)) {
                    vis[newRow][newCol] = true;
                    dfs(grid, newRow, newCol, vis);
                }
            }
        }
        return;
    }

    public int numEnclaves(int[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        dfs(grid, 0 , 0 , vis);
                int count = 0;

        for (int i = 1; i < grid.length-1; i++) {
            for (int j = 1; j < grid[0].length-1; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    count += 1 ;
                }
            }
        }
        return count;
    }
}