package oops_concepts;

   public class box{
        int age ;
        int std ;
        String name ;
        
        
        box(){
            this.age = 19 ;
            this.std = 18 ;
            this.name = "rajan" ;
        }

        box(String name , int age, int std ){
            this.age = age ;
            this.name =name  ;
            this.std = std ;
        }

        void pri(){
            // System.out.println(this.weight);
            System.out.println(this.age + "is age ");
            System.out.println(this.std + "is std ");
            System.out.println(this.name + "is name") ;

        }
    }
