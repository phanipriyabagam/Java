package oops;
public class Const{

    public static void main(String[] args) {
        //ConstructorEx.display();
         System.out.println("print main method sys");
         ConstructorEx obj = new ConstructorEx(100);
         //ConstructorEx.age = 35;
        obj.display();
       
       
    }


}

class ConstructorEx {
    int age;

    ConstructorEx(int age) {
       this.age = age;
       //here this.age is instance variable
       // age is a parameter of constructor here age value is 100 and we are assigning 100 to instance var
        System.out.println("constructor this.age" +this.age);

    }
   void display (){
    System.out.println("print display" + this.age);
    
    }


}