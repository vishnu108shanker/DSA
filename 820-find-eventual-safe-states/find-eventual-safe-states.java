class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        
        // 1. Create a reversed adjacency list and an outDegree array
        List<List<Integer>> revAdj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            revAdj.add(new ArrayList<>());
        }
        
        int[] outDegree = new int[n];
        
        // Reverse the edges: if u -> v, store v -> u
        for (int u = 0; u < n; u++) {
            outDegree[u] = graph[u].length;
            for (int v : graph[u]) {
                revAdj.get(v).add(u);
            }
        }
        
        // 2. Push all terminal nodes (outDegree == 0) into the Queue
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (outDegree[i] == 0) {
                q.offer(i);
            }
        }
        
        // 3. Process nodes via BFS
        boolean[] isSafe = new boolean[n];
        while (!q.isEmpty()) {
            int node = q.poll();
            isSafe[node] = true; // This node is guaranteed safe
            
            // Reduce outDegree of all nodes pointing to 'node'
            for (int parent : revAdj.get(node)) {
                outDegree[parent]--;
                if (outDegree[parent] == 0) {
                    q.offer(parent);
                }
            }
        }
        
        // 4. Collect all safe nodes in ascending order
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isSafe[i]) {
                result.add(i);
            }
        }
        
        return result;
    }
}
