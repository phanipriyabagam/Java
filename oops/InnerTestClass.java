package oops;

// class Outer {

    
//     int outerVar = 10;

//     class Inner {
//         void display() {
//             System.out.println("Outer variable: " + outerVar);
//         }
//     }
// }

// public class InnerTestClass {
//     public static void main(String[] args) {
//        // Outer outer = new Outer();

//        // Outer.Inner inner = outer.new Inner();
//      //  Inner inner = new Inner(); //gives error cannot 
//         inner.display();
//     }
// }

    

//  class Outer {
//     static int data = 30;

//     static class Inner {
//         void display() {
//             System.out.println("Data: " + data);
//         }
//     }
// }

// public class InnerTestClass {
//     public static void main(String[] args) {
//        //Outer.Inner inner = new Outer.Inner();
//         Inner.display();
//     }
// }
class Outer {
    static int staticVar = 100;
    int instanceVar = 50;

    static class NestedStatic {
        static int var =75;
        void display() {
            System.out.println("Static var: " +var);
            // System.out.println("Instance var: " + instanceVar); // ERROR! Can't access non-static directly
        }
    }
}

public class InnerTestClass {
    public static void main(String[] args) {
        Outer.NestedStatic nestedObj = new Outer.NestedStatic(); // No outer instance needed
       nestedObj.display();

       // System.out.println("Static var accessed directly: " + Outer.NestedStatic);
    }
}
