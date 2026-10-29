class Solution {
   

    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new ArrayDeque<>() ;
        for(int i = 0 ; i< mat.length ; i++){
            for(int j= 0 ; j< mat[0].length ; j++){
                if(mat[i][j] == 0){
                     q.add(new int[]{i,j}) ;
                }
                else {
                    mat[i][j] = -1 ;
                }
            }
        }
        int[][] dirs = {{-1,0}, {0,-1},{1,0} , {0,1}} ;
        while(!q.isEmpty()){
            int size = q.size() ; 
            for(int k = 0 ; k< size ; k++ ){
            int[] newi = q.poll() ;

            for (int[] d : dirs) {
                    int nr = newi[0] + d[0];
                    int nc = newi[1] + d[1];

                    if (nr >= 0 && nc >= 0 && nr < mat.length && nc < mat[0].length && mat[nr][nc] == -1) {
                        mat[nr][nc] =   mat[newi[0]][newi[1]] +1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        
        }
return mat ;
    }
}