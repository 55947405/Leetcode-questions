class Solution {
    public boolean dfs(int i,ArrayList<ArrayList<Integer>>adj,boolean[]vis,boolean[]path){
        vis[i] = true;
        path[i] = true;
        for(int node:adj.get(i)){
            if(!vis[node]){
                if(dfs(node,adj,vis,path)) return true;
            }
            else if(path[node]){
                return true;
            }
        }
        path[i] = false;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        boolean[] vis = new boolean[numCourses];
        boolean[] path = new boolean [numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] k:prerequisites){
            int u = k[0];
            int v = k[1];
            adj.get(u).add(v);
        }
        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
                if(dfs(i,adj,vis,path)) return false;
            }
        }
        return true;
    }
}