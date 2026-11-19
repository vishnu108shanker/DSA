class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] state = new int[n]; // 0 = unvisited, 1 = visiting, 2 = safe
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (isSafe(i, graph, state)) {
                result.add(i);
            }
        }
        
        return result;
    }
    
    private boolean isSafe(int node, int[][] graph, int[] state) {
        // If already visited, return true only if it was marked safe (2)
        if (state[node] != 0) {
            return state[node] == 2;
        }
        
        state[node] = 1; // Mark as currently visiting (part of active recursion path)
        
        for (int neighbor : graph[node]) {
            // If any neighbor is unsafe or leads to a cycle, this node is also unsafe
            if (!isSafe(neighbor, graph, state)) {
                return false; 
            }
        }
        
        state[node] = 2; // All outgoing paths are safe
        return true;
    }
}
