class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] outDegree = new int[n];
        List<List<Integer>> reverse = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            reverse.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            outDegree[i] = graph[i].length;
            if (graph[i].length == 0) q.add(i);
            for (int next : graph[i]) {
                reverse.get(next).add(i);   
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            result.add(node);
            for (int parent : reverse.get(node)) {
                if (--outDegree[parent] == 0) {
                    q.add(parent);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}