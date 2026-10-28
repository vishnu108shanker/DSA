class Solution {
    void colour (int[][] image, int sr, int sc, int color ,int initial ){
    if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != initial || image[sr][sc]== color ){
            return ;
        }
        image[sr][sc] = color ;
        colour(image , sr-1 , sc ,color ,initial) ;
        colour(image , sr , sc-1 ,color ,initial) ;
        colour(image , sr+1 , sc ,color ,initial) ;
        colour(image , sr , sc+1 ,color ,initial) ;
        return ;
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
         colour(image , sr , sc , color , image[sr][sc]) ;
        return image ;
    }
}