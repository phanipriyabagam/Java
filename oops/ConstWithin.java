package oops;

public class ConstWithin {

    String sname;
    // ConstWithin(){
    //     System.out.println("print sname" +sname);
    // }
    public static void main(String[] args) {
        
        ConstWithin stu = new ConstWithin();
        stu.sname = "Priya";
        int sresult = stu.stuDisplay();
        System.out.println(sresult);
    }

    int stuDisplay(){
        int srollno = 111;
        return srollno;

        
    }
   
   
}
