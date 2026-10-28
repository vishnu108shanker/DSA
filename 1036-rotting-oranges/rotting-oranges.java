class Solution {

        
    public int orangesRotting(int[][] grid) {
        int count = 0 ;
        int[][] dirs = {
            {-1,0} ,
            {0,-1},
            {1,0} ,
            {0 ,1}
        } ;
         Queue<int[]> q = new ArrayDeque<>();
        int freshies = 0 ;


        for(int i = 0 ; i< grid.length ; i++){
            for(int j= 0 ; j< grid[0].length ; j++ ){
                if (grid[i][j] == 2){
                q.add(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    freshies +=  1;
                }
            }
        }

        if(freshies == 0 ){
            return 0 ;
        }

         while(!q.isEmpty()){
                    int size = q.size() ;
                     boolean set = false ;
                        for(int k = 0 ; k < size ; k++ ){
                        int[] rotten = q.poll() ;

                            for(int[] d : dirs ){
                            int newrow = rotten[0] + d[0] ;
                            int newcol = rotten[1] + d[1] ;

                         if(newrow >= 0  && newrow < grid.length && newcol >= 0 && newcol <grid[0].length && grid[newrow][newcol] == 1){
                                set = true ;
                                grid[newrow][newcol] = 2; 
                                freshies--  ;
                               q.add(new int[]{newrow,newcol}) ;         
                            } 
                        }
                        }
                        if (set == true ) count += 1 ;                        
                }


        if(freshies != 0 ) return -1 ;

        return count    ;
    }
}