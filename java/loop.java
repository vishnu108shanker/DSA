import java.util.Scanner;

public class loop {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number - ");
        int x = sc.nextInt() ;
        if(x%2 == 0 ){
            System.out.println("its an even no.");
        }
        else{
            System.out.println("its an odd no. ");
        }
        System.out.println("Enter a number - ");
        int y = sc.nextInt() ;

        for(int i= 0 ; i<= y && i<= 5  ; i++){
            System.out.println("teriyaki shoot ...");
        }

//        sum of n natural no.
        int z = sc.nextInt() ;
        int sum= 0  ;
        for(int j = 0 ; j<=z ; j++){
            sum = sum+ j ;
        }
        System.out.println(sum);
        sc.close();
    }
}

