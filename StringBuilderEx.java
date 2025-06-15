public class StringBuilderEx {
 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        // sb.insert(4, " Language");
        // sb.replace(5, 13, " is a");
        // sb.delete(0, 2);
        // sb.reverse();

        System.out.println("Final String: " + sb.toString());
        System.out.println("Length: " + sb.length());
    }
}  

