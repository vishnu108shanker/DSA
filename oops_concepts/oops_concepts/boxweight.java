package oops_concepts;

    public class boxweight extends box{
        int weight ;

        boxweight(int weight){
            this.weight = weight ; 
            this.age = 20 ;
            this.std = 5 ;

        }

        boxweight(String name , int age, int std , int weight ){
            super(name, age, weight) ;
            this.weight = weight ;
        }

        void pr(){
            System.out.println(this.weight + "is weight ");
              System.out.println(this.age + "is age ");
            System.out.println(this.std + "is std ");
            System.out.println(this.name + "is name") ;

        }



    }

