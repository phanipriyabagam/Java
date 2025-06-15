import java.util.Scanner;

public class ArraysP{

    public static void main(String[] args) {
    //     int [] arr = {1,2,3,4,5};
    // System.out.println(" index[0]" + arr [0]);
       int [] arr = {1,2,3,4,5,6,7,8,9,10};
        // Scanner s =new Scanner(System.in);
        //  System.out.println("Enter number");
        // int mul = s.nextInt();
       //System.out.println(arr[0]);
       for(int index=0;index<arr.length;index++){
         for (int j = 1; j <=10; j++){
 
        System.out.println(j +"X" +arr[index]+"="+j*arr[index]);
         }
       }

    }
   
}