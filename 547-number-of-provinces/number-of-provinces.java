class Solution {
    private HashSet<Integer> mp = new HashSet<>() ;
    public int findCircleNum(int[][] isConnected) {
        int len  = isConnected.length ;
        int index = 0 ;
        for(int x = 0 ; x < len ; x++){
            if(!mp.contains(x)){
                index++ ;
                int[] num = isConnected[x] ;
                prabhuMarkkaro(isConnected , x) ;
            }
        }
        return index ;
    }

    private void prabhuMarkkaro(int[][] isConnected, int j ){
        int[] arr = isConnected[j] ;
         
        for(int i = 0 ; i < isConnected.length ; i++){
            if(arr[i] == 1) {
                if(!mp.contains(i)){
                    mp.add(i) ;
                    prabhuMarkkaro(isConnected , i) ;
                }
            }
        }
    }
}