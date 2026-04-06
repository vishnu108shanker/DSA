public class boxweigth extends box{
    int weight ;

    boxweigth(int r ,int l , int h , int w ,int weight){
        super (r , l , h , w)   ;
        this.weight = weight ;

        System.out.println(this.weight);
    }
}
