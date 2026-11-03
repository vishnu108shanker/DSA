class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] outDegree = new int[n];
        boolean[] safe = new boolean[n];

        // Reverse graph as arrays (faster than List<List<Integer>>)
        int[] head = new int[n];
        Arrays.fill(head, -1);
        int edges = 0;
        for (int[] g : graph) edges += g.length;
        int[] nxt = new int[edges];
        int[] to = new int[edges];
        int cnt = 0;

        int[] queue = new int[n];
        int qh = 0, qt = 0;

        for (int i = 0; i < n; i++) {
            outDegree[i] = graph[i].length;
            if (outDegree[i] == 0) queue[qt++] = i;
            for (int next : graph[i]) {
                to[cnt] = i;            // reversed edge: next -> i
                nxt[cnt] = head[next];
                head[next] = cnt++;
            }
        }

        while (qh < qt) {
            int node = queue[qh++];
            safe[node] = true;
            for (int e = head[node]; e != -1; e = nxt[e]) {
                int parent = to[e];
                if (--outDegree[parent] == 0) queue[qt++] = parent;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) if (safe[i]) result.add(i);
        return result;
    }
}