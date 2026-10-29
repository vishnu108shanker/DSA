class Solution {
    static int[][] dir = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } };

    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i <= mat.length - 1; i++) {
            for (int j = 0; j <= mat[0].length - 1; j++) {
                if (mat[i][j] == 1)
                    mat[i][j] = -1;
                else
                    q.add(new int[] { i, j });
            }
        }
        int dist = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] arr = q.poll();
                for (int[] num : dir) {
                    int rnew = arr[0] + num[0];
                    int cnew = arr[1] + num[1];
                    if (rnew >= 0 && cnew >= 0 && rnew < mat.length && cnew < mat[0].length && mat[rnew][cnew] == -1) {
                        mat[rnew][cnew] = dist;
                        q.add(new int[] { rnew, cnew });
                    }
                }

            }
            dist++;
        }
        return mat;
    }
}