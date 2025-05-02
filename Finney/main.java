package Finney;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // 3.2-3.4: Control flow with if/else if/else
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {  // else if statement
            System.out.print("Positive ");
        } else {
            System.out.print("Negative ");
        }

        // 3.1 & 3.6: Equivalent Boolean expressions for even check
        // 3.1 Boolean expression with simple if/else
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        // 3.5: Compound Boolean expression
        if (number != 0 && number % 5 == 0) {
            System.out.println("Divisible by 5");
        }

        // 3.7: Comparing objects
        // 2 differerent ways to compare strings
        //
        System.out.println("Enter a word:");
        String word1 = "Java";  
        String word2 = new String(scanner.next());
        System.out.println("Same object? " + (word1 == word2));
        System.out.println("Same value? " + word1.equals(word2));

        scanner.close();
    }
}