public class box extends robox  {
    int l ;
    int w ;
    int h ;

    box(int r , int l , int h , int w){
        super(r) ;
        this.l = l ;
        this.h = h;
        this.w = w ;

        ŚSystem.out.println(this.l);
        System.out.print(this.h);
        System.out.print(this.w);
    }
}
