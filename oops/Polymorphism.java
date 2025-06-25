package oops;


public class Polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.add(2, 3));         // 5
        // System.out.println(calc.add(2.5, 3.5));     // 6.0
        // System.out.println(calc.add(1, 2, 3));      // 6

        Book book = new Book();
        
    String res = book.bookType("fiction");
    String res1 = book.bookType("fiction","Volii");
    System.out.println(res1);

    Calculator cal = new Calculator();  // arguments in construtor are passed when creating objects
    SubCal scal = new SubCal();
       // cal.add(5, 8);   // for method arguments are passed like this
        
        Calculator cal1 = new SubCal();
        cal1.add(10,10,10);

    }
    
}

class Book{

String bookType(String type){
return type;


}

String bookType(String type, String name){
return type+name;



}



}



class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    static int add(int c, int b, int a) {
        System.out.println(c+b+a);
        return c+ b + a;

    }
}

class SubCal extends Calculator{

   static int add(int a, int b, int c){
    System.out.println("this is subclass" + ((a+b)-c));
    return a+b-c;


   }

}