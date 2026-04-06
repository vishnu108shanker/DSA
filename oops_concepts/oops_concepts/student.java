package oops_concepts;


     public class student{
        String name ;
        int age ;
        int pol ;
        static int poli ;

        student(String name ){
            this.name = "ravan" ;
            this.age = 18 ;
            this.pol = 1 ;
            student.poli += 1;
            
        
        }
    
        void print(){
            System.out.println("hello" + this.name);
        }

    // static class wrapper
    

    // public static void main(String[] args){
    //     student ram = new student("kunal") ;
    //     ram.name = "kunal " ;
    //     System.out.println(ram.name);
    //     System.out.println(ram.age);
    //     ram.print(); 

    // }}
    // //     int a = 10 ;
    //     int b= 100 ;
    //     Integer c = 10 ;
    //     Integer d = 20 ;

    //     System.out.println(a-b);
    //     System.out.println(b-c);

    //      swap(c,d) ;
    //     System.out.println(a + ", " + b);

    // }
    
    //     static void swap(Integer a , Integer b ){
    //         int temp =  a ;
    //          a = b ;
    //          b = temp  ;
    //     }

       
     }

