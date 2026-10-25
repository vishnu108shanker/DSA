class Solution {
    private int[][] dirs = {{ -1, 0 },{ 0, -1 },{ 1, 0 },{ 0, 1 }};

    private void dfs(char[][] grid, int row , int col, boolean[][] vis) {
            for (int[] d : dirs) {
                int newRow = row + d[0];
                int newCol = col + d[1];
                if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
                    if (grid[newRow][newCol] == '1' && !vis[newRow][newCol]) {
                        vis[newRow][newCol] = true;
                        dfs(grid , newRow , newCol , vis) ;
                    }
                }
        }
        return;
    }

    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1' && !vis[i][j]){
                    count = count + 1;
                    dfs(grid, i , j , vis);
                }
            }
        }
        return count;
    }
}