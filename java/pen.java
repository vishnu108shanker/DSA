public class pen {

//    static class pendata{}
//    String name ;
//    int price ;
//    String colour ;
//
//
//    pen(String name , int price , String colour ){
//        this.name = name ;
//        this.price = price ;
//        this.colour = colour ;
//    }

    static class Animal{
        static String name ;

//        Animal(String name ){
//            this.name = name ;
//        }

        void eat() {
            System.out.println(Animal.name + " is eating in the yard");
        }
    }

    static class Dog extends Animal{
        void bark(){
            System.out.println(Animal.name + " has done eating and is now barking ");
        }

    }


//    public static void main(String[] args){
////        Animal animal = new Animal() ;
////        animal.name = "Lion" ;
////        animal.eat();
//        Dog dog = new Dog() ;
//
//        dog.name = "labrador" ;
//        dog.bark();
//        dog.eat();
//
//        System.out.println(dog.name);
//    }


public static void main(String[] args) { int num1 = Integer.parseInt(args[0]); int num2 = Integer.parseInt(args[1]); int sum = num1 + num2; System.out.println("Sum = " + sum); }
}
