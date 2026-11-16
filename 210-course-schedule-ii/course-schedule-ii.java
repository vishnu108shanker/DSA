class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            adj.get(pre[1]).add(pre[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < numCourses; i++){

            if(!visited[i]){
                if(dfs(i, adj, visited, pathVisited, st)){
                    return new int[0];
                }
            }
        }

        int[] ans = new int[numCourses];
        int index = 0;

        while(!st.isEmpty()){
            ans[index++] = st.pop();
        }

        return ans;
    }

    private boolean dfs(int node,
                        ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited,
                        boolean[] pathVisited,
                        Stack<Integer> st){

        visited[node] = true;
        pathVisited[node] = true;

        for(int adjNode : adj.get(node)){

            if(!visited[adjNode]){
                if(dfs(adjNode, adj, visited, pathVisited, st)){
                    return true;
                }
            }
            else if(pathVisited[adjNode]){
                return true;
            }
        }

        pathVisited[node] = false;
        st.push(node);

        return false;
    }
}