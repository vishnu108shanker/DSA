import  java.util.Scanner ;

public class pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a no. here btw 1 and 10 ");
        int x = sc.nextInt() ;
        int y = sc.nextInt();
        if( x<=10 && y<=10){


            //PATTER 1
//            for(int i =1 ; i<=x ; i++){
//                for(int j =1 ; j<= y ; j++){
//                    if(i==1 || i==x || j==1 || j==y){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }


            //PATTERN 2
//            for(int i = 0 ; i<= x ; i++){
//                for(int j=0 ; j<= i ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

            //PATTERN 3
//            for(int i = 1 ; i<= x ; i++){
//                for(int j=1 ; j<=x+1-i ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

            //PATTERN 4
//            for(int i =0 ; i<=x; i++){
//                for(int j= 0  ; j<=x; j++){
//                    int sum = j+i ;
//                    if(sum >= x ) {
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }

            //PATTERN 5
//            for(int i =x ; i>=1; i--){
//                for(int j=1 ; j<= i ; j++){
//                        System.out.print(j);
//                }
//                System.out.println();
//            }

            //PATTERN 6
//            for (int i = 0 ; i<= x ; i++){
//                for(int j= 0 ; j<=i ; j++){
//                    int sum = i+j ;
//                    if(sum % 2 == 0 ){
//                        System.out.print("0");
//                    }
//                    else{
//                        System.out.print("1");
//                    }
//
//                }
//                System.out.println();
//            }

            //PATTERN 7
//            for(int i=1 ; i<=4 ;i++){
//                for(int j=1 ; j<=i ; j++){
//                    System.out.print("*");
//
//                }
//                for(int j=8 ; j>2*i ; j--){
//                    System.out.print(" ");
//                }
//                for(int j=1 ; j<=i ; j++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//            for(int i=1 ; i<=4 ;i++){
//                for(int j=4 ; j>=i ; j--){
//                    System.out.print("*");
//                }
//                for(int j=1 ; j<=2*i-2 ; j++){
//                    System.out.print(" ");
//                }
//                for(int j=4 ; j>=i ; j--){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

            //PATTERN 7
//            for(int i = 1  ; i<=5 ; i++){
//                for(int j=1 ; j<=5-i ; j++){
//                    System.out.print("_");
//                }
//                for(int k=1 ; k<=i ; k++){
//                    System.out.print(i +" ");
//                }
//                System.out.println();
//            }

            //PATTERN 8
            for(int i= 1 ; i<= 4 ; i++ ){
                for(int j= 1 ; j<=3 ; j++){
                    int sum = i+j ;
                    if(sum>=5){
                        System.out.print(5-j);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(int j=1 ; j<=i ; j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }
    }
}
