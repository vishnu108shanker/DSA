class Solution {
    public boolean bfs(int[][] graph, int node, int[] colors) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        colors[node] = 0;

        while (!q.isEmpty()) {
            int frontNode = q.poll();
            int color = colors[frontNode];

            for (int neighbour : graph[frontNode]) {
                if (colors[neighbour] == color) {
                    return false;
                } else if (colors[neighbour] == -1) {
                    q.offer(neighbour);
                    colors[neighbour] = 1 - color;
                }
            }
        }

        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        int[] colors = new int[n];
        Arrays.fill(colors, -1); // 0 - red & 1 - blue

        for (int node = 0; node < n; node++)
            if (colors[node] == -1 && bfs(graph, node, colors) == false)
                return false;

        return true;
    }
}