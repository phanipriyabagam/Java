package oops;

class Demo {
    int x;

    Demo() {
        this(50);
    }

    Demo(int x) {
        this.x = x;
    }

    void show() {
        System.out.println("x = " + x);
    }
}
public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
    }
}