package oops;

class Box {
    int size;
    static String name = "abc";
    // static{
    //     System.out.println("I am static block");
    //     System.exit(0);
    // }
    static void displayTwo(){
        System.out.println("I am static method");
      
    }

    Box() {
        this(10);
        System.out.println("I am Constructor");
    }

    Box(int s) {
        size = s;
    }

    void display() {
        System.out.println(name); 
        System.out.println("Size: " + size);
    }
// static int displayOne(){
// return size; error b'coz in  static method, instance var cannot be used
// }

}

public class Test {
    public static void main(String[] args) {
        Box b = new Box();
        b.display();
        //Box.displayTwo();
       

   }
}

// class A {
//     int x = 5;
    
//     A(int x) {
//         System.out.println(this.x);
//     }
// }
// public class Test {
//     public static void main(String[] args) {
//         A a = new A(10);
//     }
// }