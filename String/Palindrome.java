package String;

import java.util.Scanner;

public class Palindrome {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Clean the input (remove spaces and ignore case)
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Use StringBuffer to reverse the string
        StringBuffer sb = new StringBuffer(cleaned);
        String reversed = sb.reverse().toString();

        // Check if cleaned input equals reversed version
        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
}
}

