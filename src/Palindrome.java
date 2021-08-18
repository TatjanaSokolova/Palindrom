import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a sentence: ");
        String firstString = scanner.nextLine();
        String secondString = firstString.replaceAll("[^A-Za-z]", "");   //removes everything except letters
        String lowerCaseString = secondString.toLowerCase(Locale.ROOT);               //makes lower case
        System.out.println(lowerCaseString);                                          // prints out

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < lowerCaseString.length(); i++) {
            stack.push(Character.toString(lowerCaseString.charAt(i)));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString += stack.pop();
        }

        if (lowerCaseString.equals(reverseString))
            System.out.println("This is a palindrome.");
        else
            System.out.println("This isn't a palindrome.");

        //previous approach
//        String reverseString = new StringBuffer(lowerCaseString).reverse().toString();  // makes reverse string
//        System.out.println(reverseString);
//
//        if (lowerCaseString.equals(reverseString)) {
//            System.out.println("This is a palindrome");
//        } else {
//            System.out.println("This is not a palindrome");
//        }

}}