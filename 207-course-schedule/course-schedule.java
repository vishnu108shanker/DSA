class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        int[] state = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (hasCycle(i, graph, state)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean hasCycle(int course, List<List<Integer>> graph, int[] state) {
        if (state[course] == 1) {
            return true;
        }

        if (state[course] == 2) {
            return false;
        }

        state[course] = 1;

        for (int next : graph.get(course)) {
            if (hasCycle(next, graph, state)) {
                return true;
            }
        }

        state[course] = 2;
        return false;
    }
}