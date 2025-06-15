public class StringBufferEx {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() - Adds string to end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - Inserts string at specified position
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 3. replace() - Replaces characters from start to end-1 with string
        sb.replace(6, 11, " Java");
        System.out.println("After replace: " + sb);

        // 4. delete() - Deletes characters from start to end-1
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // 5. deleteCharAt() - Deletes character at specified index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 6. reverse() - Reverses the sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 7. setCharAt() - Changes character at index
        sb.setCharAt(0, 'X');
        System.out.println("After setCharAt: " + sb);

        // 8. charAt() - Gets character at index
        char c = sb.charAt(1);
        System.out.println("charAt(1): " + c);

        // 9. capacity() - Returns current capacity
        System.out.println("Capacity: " + sb.capacity());

        // 10. length() - Returns number of characters
        System.out.println("Length: " + sb.length());

        // 11. ensureCapacity() - Ensures minimum capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 12. substring() - Extracts a substring
        String sub = sb.substring(1, 4);
        System.out.println("Substring(1, 4): " + sub);

        // 13. indexOf() - Finds first index of string
        int index = sb.indexOf("a");
        System.out.println("Index of 'a': " + index);

        // 14. lastIndexOf() - Finds last index of string
        int lastIndex = sb.lastIndexOf("a");
        System.out.println("Last index of 'a': " + lastIndex);

        // 15. toString() - Converts StringBuffer to String
        String str = sb.toString();
        System.out.println("String version: " + str);

        // 16. setLength() - Sets new length
        sb.setLength(10);
        System.out.println("After setLength(10): " + sb + " (length: " + sb.length() + ")");
    }
}
